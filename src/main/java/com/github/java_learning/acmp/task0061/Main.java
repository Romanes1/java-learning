package com.github.java_learning.acmp.task0061;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int [] numbers = new int[8];
        for (int i = 0; i <8; i++) {
            numbers[i]=in.nextInt();
        }
       int a=numbers[0] + numbers[2] + numbers[4] + numbers[6];
        int b=numbers[1] + numbers[3] + numbers[5] + numbers[7];
        if(a > b) out.println(1);
        if(a < b) out.println(2);
        if(a == b) out.println("DRAW");
        out.flush();
    }
}
