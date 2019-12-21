package com.kaushaltop;

public class Main {

    public static void main(String[] args) {

        System.out.println(reverseString("Kaushal"));

    }

    public static String reverseString (String str) {

        StackForString stack = new StackForString(str.length());

        char[] myCharArray = str.toCharArray();

        for (int i=0; i<myCharArray.length; i++) {

            stack.push(myCharArray[i]);
        }
        char values = 0;
        String newStr = null;

        StringBuilder stringBuilder = new StringBuilder();

        while (!stack.isEmpty()) {

            values = stack.pop();
            stringBuilder.append(values);
            newStr = stringBuilder.toString();
        }
        return newStr;
    }
}
