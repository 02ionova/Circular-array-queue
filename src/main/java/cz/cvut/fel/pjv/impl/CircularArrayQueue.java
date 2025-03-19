package cz.cvut.fel.pjv.impl;

import cz.cvut.fel.pjv.Queue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Implementation of the {@link Queue} backed by a fixed-size circular array.
 */
public class CircularArrayQueue implements Queue {
    private final String[] queue;
    private final int capacity;
    private int front;
    private int rear;
    private int size;

    /**
     * Creates the queue with a default capacity of 5.
     */
    public CircularArrayQueue() {
        this(5);
    }

    /**
     * Creates the queue with the given {@code capacity}.
     * The capacity represents the maximal number of elements the queue can store.
     * @param capacity Maximum number of elements in the queue.
     */
    public CircularArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new String[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public boolean enqueue(String obj) {
        if (obj == null || isFull()) {
            return false;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = obj;
        size++;
        return true;
    }

    @Override
    public String dequeue() {
        if (isEmpty()) {
            return null;
        }
        String value = queue[front];
        queue[front] = null; // Optional: clear reference for garbage collection
        front = (front + 1) % capacity;
        size--; // FIXED: Correctly decrement size
        return value;
    }

    @Override
    public Collection<String> getElements() {
        List<String> elements = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            elements.add(queue[(front + i) % capacity]);
        }
        return elements;
    }

    @Override
    public void printAllElements() {
        System.out.println(getElements());
    }
}
