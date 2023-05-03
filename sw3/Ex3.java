package org.example.sem1.sw3;
// Дана строка юПоменять местами ее половины.
public class Ex3 {
    public static void main(String[] args) {
        System.out.println(replacePartOfString("I walk through the valley of the shadow ..."));
    }

    public static String replacePartOfString(String str){
        int length = str.length() / 2;
        String sub1 = str. substring(0,length / 2);
        String sub2 = str. substring(length / 2, length);

        return sub2 + sub1;
    }
}
