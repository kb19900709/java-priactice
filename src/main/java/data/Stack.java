package data;

import java.lang.reflect.Array;

public class Stack<T> {
    private int top = -1;

    private int max;

    private T[] objectArray;

    public Stack(Class<T> targetClass, int size) {
        this.objectArray = (T[]) Array.newInstance(targetClass, size);
        this.max = size;
    }

    public void push(T t) {
        if (top + 1 == max) {
            System.out.println(String.format("out of space, %s", t.toString()));
            return;
        }

        objectArray[++top] = t;
    }

    public T pop() {
        if (top >= 0) {
            return objectArray[top--];
        }
        return null;
    }

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>(String.class, 5);
        stringStack.push("5"); // the first element
        stringStack.push("4");
        stringStack.push("3");
        stringStack.push("2");
        stringStack.push("1"); // the last element
        stringStack.push("0");

        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
    }
}
