package com.github.java_learning.acmp.task0597;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int r1 = in.nextInt();
        int r2 = in.nextInt();
        int r3 = in.nextInt();
        int r = r2 + r3;

        if (r1>=r)
            System.out.println("YES");
        else System.out.println("NO");
        out.flush();
    }
}