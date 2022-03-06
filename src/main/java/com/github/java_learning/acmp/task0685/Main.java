package com.github.java_learning.acmp.task0685;

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
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        ArrayList<Integer> type = new ArrayList<>();
        type.add(a);
        type.add(b);
        type.add(c);
        ArrayList<Integer> weight = new ArrayList<>();
        weight.add(d);
        weight.add(e);
        weight.add(f);
        int h = Collections.max(type);
        type.remove(Collections.max(type));
        int i = Collections.min(type);
        type.remove(Collections.min(type));
        int j = Collections.min(type);
        int k = Collections.max(weight);
        weight.remove(Collections.max(weight));
        int l = Collections.min(weight);
        weight.remove(Collections.min(weight));
        int m = Collections.min(weight);
        int o = ((h * k) + (i * l) + (j * m));
        out.print(o);
        out.flush();
    }


}
