package com.Company.Tests;

import org.testng.annotations.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class Prac {

    @Test
    public void pairOfNumber() {

        int[] arr = {1, 2, 3, 4, 7, 8, 9, 4, -2};
        int target = 5, currentSum = 0, start = 0, last = arr.length - 1;

        Arrays.sort(arr);
        while (start < last) {
            currentSum = arr[start] + arr[last];
            if (currentSum > target) {
                last--;
            } else if (currentSum < target) {
                start++;
            } else {
                System.out.println("pair => " + arr[start] + " , " + arr[last]);
                start++;
                last--;
            }
        }

    }

    @Test
    public void LargestNumberLessThanNumber() {
        int number = 153;
        int numberNotRequired = 1;
        while (String.valueOf(number).contains(String.valueOf(numberNotRequired))) {
            number--;
        }
        System.out.println("required number ==> " + number);
    }

    @Test
    public void secondLargest() {
        int[] arr = {1, 4, 7, 8, 20, 3};
        int first = 0, second = 0;

        if (arr[0] > arr[1]) {
            first = arr[0];
            second = arr[1];
        } else {
            first = arr[1];
            second = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > first) {
                int temp = arr[i];
                second = first;
                first = temp;
            } else if (first > arr[i] && arr[i] > second) {
                second = arr[i];
            }
        }

        System.out.println(second);
    }

    @Test
    public void validParanthesis() {
        String str = "({[]})";
        Stack<Character> stack = new Stack<>();
        char[] c = str.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            }
        }

        for (int i = 0; i < c.length; i++) {
            if (
                    str.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(' ||
                            str.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{' ||
                            str.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '['


            ) {
                stack.pop();
            }
        }
        System.out.println("Valid Paramtheses ==> " + stack.isEmpty());
    }

    @Test
    public void reverseTillPalindrome() {


    }

    @Test
    public void armstrong() {
        int number = 153, power = String.valueOf(number).length(), sum = 0, currentNumber = 1;

        while (number>0){
            int rem = number %10;
            for (int i = 0; i < power; i++) {
                currentNumber = currentNumber *rem;
            }
            sum = sum+currentNumber;
            currentNumber = 1;
            number = number/10;
        }
        System.out.println(sum);

    }

    @Test
    public void duplicate() {

    }

    @Test
    public void reverseWithSpace() {
        String str = "i love my country.";
        char[] c = str.toCharArray();
        int start = 0, last = c.length - 1;
        for (int i = 0; i < c.length / 2; i++) {
            if (c[i] == ' ') {
                start++;
            } else if (c[last] == ' ') {
                last--;
            } else {
                char temp = c[start];
                c[start] = c[last];
                c[last] = temp;
                start++;
                last--;
            }
        }
        System.out.println(new String(c));
    }

    @Test
    public void reverse2() {
        String str = "Ashwani";
        char[] c = str.toCharArray();
        Deque<Character> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (char c1 : c) {
            deque.push(c1);
        }

        System.out.println("deque =>    " + deque);

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
