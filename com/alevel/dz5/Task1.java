package com.alevel.dz5;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {45, 16, 789, 123, 45, 1, 67,123, 89, 16, 45, 18,123, 16, 67, 16,123, 13, 45, 78, 9, 31,};
        int num = 0;
        int countRepeat;
        int maxRepeat = 0;

        for (int i = 0; i < arr.length; i++) {
            countRepeat = 1;

            for (int j = i + 1; j < arr.length; j++) {
                num = arr[i];

                if (arr[i] == arr[j] && (j != i)) {
                    countRepeat++;
                }
            }
            if ((maxRepeat <= countRepeat) && (countRepeat != 1)) {
                maxRepeat = countRepeat;

                System.out.println(" число " + num + " совпадает " + maxRepeat+ " раза");


            }
        }
        int [] resultArr = {123,16, 45};
        int min = resultArr[0];

        for(int i = 0;i < resultArr.length;i++){
            if(resultArr[i] < min ){
                min = resultArr[i];
                System.out.println();
                System.out.println(" меньшее "+min);
            }

        }

    }

}


