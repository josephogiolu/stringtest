package com.digivision.stringtest;

import java.util.Stack;

public class ReverseInsideParentheses {
    public static String reverseInsideParentheses(String s) {
        char[] result = s.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                int start = stack.pop();
                int end = i;
                reverseSubstring(result, start + 1, end - 1);
            }
        }

        return new String(result);
    }

    private static void reverseSubstring(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
