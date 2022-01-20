package com.github.java_learning.acmp.task0766;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = a * b;
        if (d >= c) {
            out.print("YES");
        } else {
            out.print("NO");
        }
        out.flush();
    }
}
