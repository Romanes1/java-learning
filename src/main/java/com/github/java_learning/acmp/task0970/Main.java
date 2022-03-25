package com.github.java_learning.acmp.task0970;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


        String yn = aPlusBequalsC(a, b, c);
        out.print(yn);
    }

    static String aPlusBequalsC(int a, int b, int c) {
        if (a + b == c || b + c == a || a + c == b) {
            return "YES";
        } else
            return "NO";

    }
}