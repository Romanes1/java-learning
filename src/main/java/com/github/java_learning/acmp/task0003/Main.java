package com.github.java_learning.acmp.task0003;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b= a / 10;
        long c = (b*(b+1));
        if (c>0)
        {
            out.print(c);
        out.print("25");
        }
        else out.print("25");
            out.flush();
    }
}
