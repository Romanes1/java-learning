package com.github.java_learning.acmp.task0106;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int c = 0;
        int d = 0;
        for (int i = 0; i < a; i++) {
            int b = in.nextInt();
            if (b==1) c++;
            else d++;
        }
        int e = Math.min(c,d);
                    out.print(e);
        out.flush();
    }
}