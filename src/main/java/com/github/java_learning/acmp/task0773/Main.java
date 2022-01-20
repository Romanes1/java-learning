package com.github.java_learning.acmp.task0773;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int c = a*a;
        int d = in.nextInt();
        int e = c*d;


        out.print(e);
        out.flush();
    }
}



