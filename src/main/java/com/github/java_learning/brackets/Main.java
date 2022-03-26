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
        char previous = chArray[0];
        MyStack stack = new MyStack(a);
        for (int i = 0; i < a; i++) {
            char b = chArray[i];
            char c = '(';
            char d = '[';
            char e = ')';
            char f = ']';
            if (b == c || b == d) {
                stack.push(b);
            }
            if (i >= 1) {
                previous = chArray[i - 1];
            }
            if (b == e && previous == d) {
                System.out.println("false");
                return;
            } else if (b == f && previous == c) {
                System.out.println("false");
                return;
            } else if (b == e || b == f) {
                stack.pop();
            }
        }
        if (0 == MyStack.getSize()){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}


