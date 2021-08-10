package com.company2;

import java.util.LinkedList;
import java.util.Stack;

public class MinStack {
    /*int num;
    LinkedList<Integer> minList = new LinkedList<>();
    Stack stack = new Stack();

    public static int pop() {
        int element=stack.peek();
        if (stack.peek() == getMin()) {
            stack.pop();
            minList = minList.next;
            //update new min
        } else {
            stack.pop();
        }
        return element;
    }

    public static void push(int num) {
        if (num < getMin() || !minList.isEmpty()) {
            Node newMin = num;
            newMin.next = minList;
            minList = newMin;
            stack.push(num);
        } else {
            stack.push(num);
        }
    }

    public static int getMin() {
        return minList.data;
    }*/
}
