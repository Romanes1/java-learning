package com.github.java_learning.acmp.task0819;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long a = in.nextInt();
        long b = in.nextInt();
        long c = in.nextInt();
        long d = GetD(a, b, c);
        long e = GetE(a, b, c);
        out.print(d);
        out.print(" ");
        out.print(e);
        out.flush();
    }

    static long GetE(long a, long b, long c) {
        long e = a * b * c;
        return e;
    }

    static long GetD(long a, long b, long c) {
        long d = 2 * (a * b + a * c + b * c);
        return d;
    }
}