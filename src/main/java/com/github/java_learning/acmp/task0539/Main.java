package com.github.java_learning.acmp.task0539;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int k = n / 2;
        if (n == 1)
            out.print(0);
        if (n % 2 == 0)
            out.print(k);
        else
        if(n != 1) out.print(n);
               out.flush();
    }
}