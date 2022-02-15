package com.github.java_learning.acmp.task0106;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int c = 0;
        int d = 0;
        for (int i = 0; i < a; i++) {
            int b = in.nextInt();
            if (b==1) c++;
            else d++;
        }
        int e = Math.min(c,d);
                    out.print("0");

        if (c==a)
            out.print("0");
        else
        if (c==0)
            out.print("0");
        else
        if (2d<a)
            out.print(d);
                    else out.print(c);
        out.flush();
    }
}