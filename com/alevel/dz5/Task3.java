package com.alevel.dz5;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(+array[i] + ",");
        }

        int[] result = result(array);
        System.out.println("\nСортировка выбором");
        for (int i = 0; i < array.length; i++) {
            System.out.print(result[i] + ",");
        }

    }


    public static int[] result(int[] minArray) {
        for (int i = 0; i < minArray.length - 1; i++) {
            int min = minArray[i];
            int swap = i;
            for (int j = i + 1; j < minArray.length; j++) {
                if (minArray[j] < min) {
                    swap = j;
                    min = minArray[j];
                }
            }
            int tmp = minArray[swap];
            minArray[swap] = minArray[i];
            minArray[i] = tmp;
        }
        return minArray;

    }
}



