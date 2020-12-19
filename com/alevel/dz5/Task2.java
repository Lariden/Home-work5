package com.alevel.dz5;


import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[3][];
        int[][] bArray = new int[3][];

        System.out.println("Изначальная матрица");

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[3];
            bArray[i] = new int[3];
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(30);
                System.out.print(array[i][j] + " ");

            }
            System.out.println();

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                bArray[i][j] = array[j][i];
            }

        }


        System.out.println("Меняем строки на столбцы");
        
        for (int i = 0; i < bArray.length; i++) {
            for (int j = 0; j < bArray.length; j++) {
                System.out.print(bArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}