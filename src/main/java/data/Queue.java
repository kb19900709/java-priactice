package data;

import java.lang.reflect.Array;

public class Queue {

    public static void main(String[] args) {
        basicQueueTest();
    }

    private static void basicQueueTest() {
        BasicQueue<String> stringBasicQueue = new BasicQueue<>(String.class, 5);
        stringBasicQueue.enqueue("1");
        stringBasicQueue.enqueue("2");
        stringBasicQueue.enqueue("3");

        System.out.println(stringBasicQueue.dequeue());
        System.out.println(stringBasicQueue.dequeue());
        System.out.println(stringBasicQueue.dequeue());
        System.out.println(stringBasicQueue.dequeue());

        stringBasicQueue.enqueue("4");
        stringBasicQueue.enqueue("5");

        System.out.println(stringBasicQueue.dequeue());
        System.out.println(stringBasicQueue.dequeue());
        System.out.println(stringBasicQueue.dequeue());

        stringBasicQueue.enqueue("6");
        System.out.println(stringBasicQueue.dequeue());
    }

    private static class BasicQueue<T> {
        private T[] objectArray;
        private int max;
        private int rear = -1;
        private int front = 0;

        public BasicQueue(Class<T> objectClass, int size) {
            this.objectArray = (T[]) Array.newInstance(objectClass, size);
            this.max = size;
        }

        private void enqueue(T t) {
            if (rear + 1 == max) {
                System.out.println("the queue is full of capacity");
                return;
            }

            objectArray[++rear] = t;
        }

        private T dequeue() {
            if (front > rear) {
                System.out.println("the queue is empty");
                return null;
            }
            return objectArray[front++];
        }
    }

    private static class CircleQueue<T>{
        private T[] objectArray;
        private int max;
    }
}
