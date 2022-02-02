package com.github.java_learning.acmp.task0092;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = a/6;
        int c = b*4;
        out.print(b);
        out.print(" ");
        out.print(c);
        out.print(" ");
        out.print(b);
        out.flush();
    }
}
