
//todo ХОТКЕИ В INTELIJ
// todo: комментирование
// todo: main -> создание стандартной оберктки public class Main {
//    public static void main(String[] args)
// todo: sout -> System.out.println("");
//todo: после метода возможен быстрый вывод через .soutv
// todo: fori -> цикл for по умолчанию
// todo: ctrl+alt+l - форматирование
// todo: ctrl+alt+o -  удаление неиспользуемого импорта в проекте
// todo: alt+enter создание метода или импорт
//todo передвигаться по стрелочкам alt+shift и стрелочки
// todo SHIFT+F10 ЗАПУСК ПРОГИ
//todo ALT+J выделить все упоминания переменных(одинаковых наименований)
//todo /**+Enter - джава документирование пишется всегда выше самого метода(важная вещь в ООП)
package org.example.sem1.sw1;

import java.util.Scanner;
//Given an integer number n, return the difference between the product of its digits and the sum of its digits..
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println(subtractProductAndSum(a));
        scanner.close();
    }

    /**
     *
     * @param  = задаваемое число
     * @return = возвращает произведение минус сумма
     */
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int summ = 0;
        while (n != 0){
            product *= n % 10;
            summ += n % 10;
            n /= 10;
        }
        return product - summ;
    }
}










