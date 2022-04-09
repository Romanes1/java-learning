package com.github.java_learning.brackets;

import java.util.Arrays;

public class MyStack {

    private char[] state;
    private static int size = 0;

    public MyStack(int maxSize) {
        state = new char[maxSize];
    }

    /**
     * Добавляет элемент в голову стека
     *
     * @param element новый элемент для добавления
     */
    public void push(char element) {
        state[size] = element;
        size = size + 1;
    }

    /**
     * Берет элемент из головы,
     * удаляет его из стека и возвращает из функции
     *
     * @return последний добавленный элемент
     */
    public int pop() {
        if (size == 0) {
            System.out.println("false");

        }

        int element = state[size - 1];
        size = size - 1;
        return element;

    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyStack myStack = (MyStack) o;

        return Arrays.equals(state, myStack.state);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(state);
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "What chars are inside the stack" + Arrays.toString(state) +
                '}';
    }
}