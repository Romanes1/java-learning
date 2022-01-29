package com.github.java_learning.acmp.task0755;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = a + b - c;
        if (d>=0) out.print(d);
        else out.print("Impossible");
        out.flush();
    }
}