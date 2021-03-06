//package com.sandeep;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader( new FileReader("shell.in"));
        PrintWriter pw = new PrintWriter( new FileWriter("shell.out"));
        //Scanner sc = new Scanner(System.in);
        int shell1 = 0;
        int shell2 = 0;
        int shell3 = 0;
        int tmp;
        int a;
        int b;
        int g;
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i=0; i < n; i++) {
            st = new StringTokenizer(r.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            g = Integer.parseInt(st.nextToken());
            tmp = arr[a-1];
            arr[a-1]= arr[b-1];
            arr[b-1] = tmp;

            if (arr[g-1] == 1) {
                shell1++;
            }
            if (arr[g-1] == 2) {
                shell2++;
            }
            if (arr[g-1] == 3) {
                shell3++;
            }
        }
        int maxPts = Math.max(shell1, Math.max(shell2,shell3));
        pw.print(maxPts);

        r.close();
        pw.close();


    }
}
