package com.github.java_learning.brackets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] chArray = string.toCharArray();
        int a = chArray.length;
        int count = 0;
        MyStack stack = new MyStack(a);
        for (int i = 0; i < a; i++) {
            char b = chArray[i];
            String br = "(";
            char[] bracket = br.toCharArray();
            char с = bracket[0];
            if (b == с) {
                stack.push(b);
                count++;
            } else {
                stack.pop();
            }
        }
        int count2 = count * 2;
        if (count2 == a) System.out.println("true");
        else System.out.println("false");
    }
}

