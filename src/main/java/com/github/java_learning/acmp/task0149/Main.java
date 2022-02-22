package com.github.java_learning.acmp.task0149;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int[] b;
        b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = in.nextInt();
            }
        for (int i = a-1; i >= 0; i--) {
            System.out.println(b[i]);
                  }
        out.flush();
        }


        }

