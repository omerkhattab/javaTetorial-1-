/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack;

/**
 *
 * @author DELL
 */
public class Stackx {
  

    int maxSize;
    int[] stackArray;
    int top;

    Stackx(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    void push(int value) {
        if (top == maxSize - 1)
            System.out.println("Stack Overflow");
        else
            stackArray[++top] = value;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArray[top--];
    }

    int peek() {
        return stackArray[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

