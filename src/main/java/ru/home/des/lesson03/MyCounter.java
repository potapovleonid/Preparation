package ru.home.des.lesson03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyCounter {
    private int count;
    private Lock lock;

    public MyCounter() {
        this.lock = new ReentrantLock();
    }

    public void increment(){
        try {
            lock.lock();
            count++;
        } finally {
            lock.unlock();
        }
    }

    public void decrement(){
        try {
            lock.lock();
            count--;
        } finally {
            lock.unlock();
        }
    }

    public int getCount(){
        return count;
    }

    public void printCount(){
        System.out.println("Count: " + count);
    }
}
