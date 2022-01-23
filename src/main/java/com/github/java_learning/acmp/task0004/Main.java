package com.github.java_learning.acmp.task0004;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        int b = (9-a);


        out.print(a);
        out.print(9);
        out.print(b);


        out.flush();
    }
}

