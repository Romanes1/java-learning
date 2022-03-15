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
        char previous = chArray[0];
        MyStack stack = new MyStack(a);
        for (int i = 0; i < a; i++) {
            char b = chArray[i];
            String br = "(";
            String br1 = "[";
            String br2 = ")";
            String br3 = "]";
            char[] bracket = br.toCharArray();
            char[] bracket1 = br1.toCharArray();
            char[] bracket2 = br2.toCharArray();
            char[] bracket3 = br3.toCharArray();
            char c = bracket[0];
            char d = bracket1[0];
            char e = bracket2[0];
            char f = bracket3[0];
            if (b == c || b == d) {
                stack.push(b);
                count++;
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
                    count--;
                }
        }
        if (count==0){
            System.out.println("true");
        }
        }
    }


