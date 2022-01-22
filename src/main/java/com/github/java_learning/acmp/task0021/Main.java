package com.github.java_learning.acmp.task0021;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int d = (-b+10);

        out.print(c);
        out.print("\n");

        out.print(d);

        out.flush();
    }
}