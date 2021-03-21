package com.tematihonov;

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
        System.out.println();
        startTime = System.nanoTime();
        for (int i = 0; i < mArray.length; i++) {
            list.add(i, mArray[i]);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("Время перевода массив в лист: " + endTime);
        System.out.println(list);
        System.out.println();


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
        System.out.println();


        System.out.println("Task 3.3");
        List3 listTask3 = new List3();
        startTime = System.nanoTime();
        listTask3.add(20);
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода add в односвязном списке: " + endTime);
        startTime = System.nanoTime();
        listTask3.print();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода print в односвязном списке: " + endTime);
        startTime = System.nanoTime();
        listTask3.remove();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода remove в односвязном списке: " + endTime);
        System.out.println();


        System.out.println("Task 3.4");
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }
        System.out.println(linkedList);
        startTime = System.nanoTime();
        linkedList.addFirst(2);
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода addFirst: " + endTime);
        startTime = System.nanoTime();
        linkedList.addLast(4);
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода addLast: " + endTime);
        startTime = System.nanoTime();
        linkedList.removeFirst();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода removeFirst: " + endTime);
        startTime = System.nanoTime();
        linkedList.removeLast();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода removeLast: " + endTime);
        startTime = System.nanoTime();
        linkedList.getFirst();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода getFirst: " + endTime);
        linkedList.getLast();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода getLast: " + endTime);
        System.out.println();


        System.out.println("Task 3.5");
        Iterator<Integer> iter = list.iterator();
        startTime = System.nanoTime();
        iter.next();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода next: " + endTime);
        startTime = System.nanoTime();
        iter.hasNext();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода hasNext: " + endTime);
    }
}
