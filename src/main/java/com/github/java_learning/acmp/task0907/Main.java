package com.github.java_learning.acmp.task0907;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int r = in.nextInt();
        int d = 2 * r;


        if (a >= d & b >= d) {
            out.print("YES");
        } else
            out.print("NO");
        out.flush();
    }
}

