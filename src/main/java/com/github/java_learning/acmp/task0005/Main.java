package com.github.java_learning.acmp.task0005;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int [] numbers = new int[n];
        for (int i = 0; i <n ; i++) {
        numbers[i]=in.nextInt();
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int j = 0; j < n; j++) {
          int x = numbers[j];
          if(x%2==0)
              even.add(x);
          else
              odd.add(x);
        }
        out.println(odd);
        out.println(even);
        int four = odd.size();
        int three = even.size();
        if (four < three)
        out.println("YES");
        else out.println("NO");
        out.flush();
    }
}
