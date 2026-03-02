/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author DELL
 */
public class Q {
    int nl ;
    int max ;
    int front;
    int rear;
    int[] array;

    public Q(int max) {
        nl = 0;
        this.max = max;
        front = 0;
        rear = -1;
        array = new int[this.max];
    }
    
    void insert(int in){
    if(rear == this.max-1){
    rear =-1;
    }
    array[++rear]=in;
    nl++;
    }
    int remove(){
        int re = array[front++];
        if(front == this.max){
        front =0;
        }
        nl--;
        return re;
    }
    boolean isEmpty(){
    return (nl==0);
    }
    boolean isFull(){
    return (nl==this.max);
    }
}
