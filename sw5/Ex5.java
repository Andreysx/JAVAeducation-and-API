package org.example.sem1.sw5;
//Дан массив целых чисел. Верно ли, что массив является симметричным.
public class Ex5 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 3, 2, 2};
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                flag = false;
            }
        }
        if (!flag)
            System.out.println("Massive is none symmetry");
        else
            System.out.println("Massive is symmetry");
    }
}
