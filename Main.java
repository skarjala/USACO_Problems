//package com.sandeep;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int tarp (int x1,int y1,int x2,int y2, int bx, int by, int tx, int ty) {
        int area = 0;
        int width = 0;
        int length = 0;
        if (tx <= x1 || bx >= x2 || ty <= y1 || by >= y2) {
            area = (x2-x1) * (y2-y1);
            return area;
        } else {
            if (tx >= x2 && bx <= x1 && ty >= y2 && by <= y1) {
                area = 0;
                return area;
            }
            else if ((tx >= x2 && bx <= x1) || (ty >= y2 && by <= y1)) {

                if ((tx >= x2 && bx <= x1 && ty <= y2 && by >= y1) || (ty >= y2 && by <= y1 && tx <= x2 && bx >= x1)) {
                    area = (x2 - x1) * (y2 - y1);
                    return area;
                } else {
                    width = Math.min(x2, tx) - Math.max(x1, bx);
                    length = Math.min(y2, ty) - Math.max(y1, by);
                    area = (x2 - x1) * (y2 - y1) - (width * length);
                    return area;
                }
            } else {
                area = (x2-x1) * (y2-y1);
                return area;
            }
        }
    }

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader r = new BufferedReader( new FileReader("billboard.in"));
        PrintWriter pw = new PrintWriter( new FileWriter("billboard.out"));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(r.readLine());

        int bx = Integer.parseInt(st.nextToken());
        int by = Integer.parseInt(st.nextToken());
        int tx = Integer.parseInt(st.nextToken());
        int ty = Integer.parseInt(st.nextToken());
        pw.print(tarp(x1,y1,x2,y2,bx,by,tx,ty));
        r.close();
        pw.close();
    }
}
