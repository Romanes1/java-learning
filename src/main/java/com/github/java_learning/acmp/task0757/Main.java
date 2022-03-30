package com.github.java_learning.acmp.task0757;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = a/2;
        long e = b/6;
        long f = Math.min(d,e);
        long g = Math.min(f,c);
        out.print(g);
        out.flush();
    }
}
