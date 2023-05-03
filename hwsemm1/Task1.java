package org.example.sem1.hwsemm1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ввод: ");
        String s = scanner.nextLine();
        String[] str = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(str));
        s = String.join(" ", str);
        System.out.printf("Вывод: %s", s);
    }

}
