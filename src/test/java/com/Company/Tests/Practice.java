package com.Company.Tests;

import org.testng.annotations.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class Practice {

    @Test
    public void reverse2() {
        String str = "Ashwani";
        char[] c = str.toCharArray();
        Deque<Character> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (char c1 : c) {
            deque.push(c1);
        }

        System.out.println("deque =>    "+deque);

        for (int i = 0; i < c.length; i++) {
            sb.append(deque.pop());
        }
        System.out.println("string builder => " + sb);
    }

    @Test
    public void reverse1() {
        String str = "ashwani";
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println("string builder => " + sb);
    }

    @Test
    public void reverse() {
        String str = "Ashwani";
        char[] c = str.toCharArray();
        int last = str.length() - 1;

        for (int i = 0; i < str.length() / 2; i++) {
            char temp = c[i];
            c[i] = c[last];
            c[last] = temp;
            last--;
        }
        System.out.println(new String(c));
    }
}
