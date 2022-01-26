package com.github.java_learning.acmp.task0021;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        int d = Collections.max(list);
        int e = Collections.min(list);
        int f = d - e;
        out.print(f);
        out.flush();
    }
}