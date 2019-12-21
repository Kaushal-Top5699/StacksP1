package com.kaushaltop;

public class StackForString {

    private int maxSize;
    private char[] stackArray;
    private int top;//simple index for our stack

    //This is a constructor that simply creates a stack
    public StackForString(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    //This method pushes an item or data on to the stack
    public void push(char item) {

        if (isFull()) {

            System.out.println("Stack is full");
        } else {
            //Increment the index
            top++;
            //Pass on the value to the stack
            stackArray[top] = item;
        }
    }

    //This method pops an item out of the stack
    public char pop() {

        if (!isEmpty()) {
            //Store the index of the topmost variable
            int topMostIndex = top;
            //Decrement top, since, variable is deleted
            top--;
            //Return the deleted variable
            //Delete it by passing its index, in this case topMostIndex
            return stackArray[topMostIndex];
        } else {

            return '0';
        }
    }

    //This method returns the topMost element on the stack
    public char peak() {

        return stackArray[top];
    }

    //This returns whether stack is empty or not, and if its empty
    //then it returns the top, which will be in this case -1
    public boolean isEmpty() {

        return (top == -1);
    }

    //This method returns whether stack is full or not, and if its full
    public boolean isFull() {

        return (maxSize-1 == top);
    }

}
