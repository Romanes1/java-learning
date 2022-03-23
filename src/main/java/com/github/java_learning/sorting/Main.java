package com.github.java_learning.sorting;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("sfffjks","sdjhsk","dkjndjkdfgf","fgfg","g");
        strings.sort(new StringComparatorByLength());
        System.out.println(strings);
    }
}
