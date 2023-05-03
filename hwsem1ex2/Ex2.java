package org.example.sem1.hwsem1ex2;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел -> ");
        int number = scanner.nextInt();
        int summ = 0;
        int prevNum = 0;
        while (number != 0) {
            prevNum = number;
            number = scanner.nextInt();
            if (number < 0) summ += prevNum;
        }
        System.out.println("Сумма положительных чисел, после которых следует отрицательное число -> ");
        System.out.println(summ);
    }




}
