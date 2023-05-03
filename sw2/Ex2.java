package org.example.sem1.sw2;
//todo psvn создает public static void main(String[] args)\

import java.util.Scanner;

//Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countDiff(n, scanner));
        scanner.close();
    }

    /**
     *
     * @param n - количество чисел в последоввательности
     * @param scanner
     * @return - количество переходов с положительного на отрицательное
     */
    public static int countDiff(int n, Scanner scanner) {
        int count = 0;
        int a = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int b = scanner.nextInt();
            if (a > 0 && b < 0) {
                count++;
            }
            a = b;
        }
        return count;
    }
}
