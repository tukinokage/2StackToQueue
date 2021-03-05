package com.shay.test;

public class Main {

    public static void main(String[] args) {
        int[] datas = {0,1,2,1,2,0};
        MyQueue obj = new MyQueue();
        for(int data:datas){
            obj.push(data);
        }
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
        System.out.println("pop:" + param_2 );
        System.out.println("peek:" + param_3 );
        System.out.println("isEmpty:" + param_4 );
    }
}
