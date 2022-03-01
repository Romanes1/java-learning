package com.github.java_learning.acmp.task0892;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        if (a == 12 || a == 1 || a == 2)
            System.out.println("Winter");
        if (a == 3 || a == 4 || a == 5)
            System.out.println("Spring");
        if (a == 6 || a == 7 || a == 8)
            System.out.println("Summer");
        if (a == 9 || a == 10 || a == 11)
            System.out.println("Autumn");
        if (a > 12)
            System.out.println("Error");
        out.flush();
    }
}
