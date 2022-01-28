package com.github.java_learning.acmp.task0033;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = (b - 1);
        int d = (a - 1);
        out.print(c);
        out.print(" ");
        out.print(d);
        out.flush();
    }
}
