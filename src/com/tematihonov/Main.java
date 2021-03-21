package com.tematihonov;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer[] mArray;
        Integer[] mArray2;
        Integer a = 4;
        long startTime;
        long endTime;
        mArray = new Integer[15];

        Random random = new Random();
        for (int i = 0; i < mArray.length; i++) {
            mArray[i] = random.nextInt(10);
        }

        List<Integer> list = new ArrayList<>();


        System.out.println("Task 3.1");
        startTime = System.nanoTime();
        for (int i = 0; i < mArray.length; i++) {
            list.add(i, mArray[i]);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("Время перевода массив в лист: " + endTime);
        System.out.println(list);

        System.out.println("Task 3.2");
        startTime = System.nanoTime();
        list.add(3);
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода add: " + endTime);
        startTime = System.nanoTime();
        list.set(0, 6);
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода set: " + endTime);
        startTime = System.nanoTime();
        list.remove(8);
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода remove: " + endTime);
        startTime = System.nanoTime();
        list.remove("3");
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода remove по индексу: " + endTime);
        startTime = System.nanoTime();
        list.get(4);
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода get: " + endTime);

        System.out.println("Task 3.3");
    }
}
