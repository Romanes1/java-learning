package com.github.java_learning.acmp.task0692;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        int c=0;
        for (int i = 0; i < 30; i++) {
            int b = (int) Math.pow(2, i);
            if (a == b) {
                out.print("YES");
                c++;
            }
        }
        if (c==0) {
            out.print("NO");
            out.flush();
        }
        else out.flush();
    }
}
