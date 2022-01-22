package com.github.java_learning.acmp.task0033;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = (-a+10);
        int d = (-b+10);

        out.print(c);
        out.print("\n");

        out.print(d);

        out.flush();
    }
}
