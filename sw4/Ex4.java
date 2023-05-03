package org.example.sem1.sw4;
//Given two binary strings a and b, return their sum as a binary string.
//Учитывая две двоичные строки a и b, верните их сумму в виде двоичной строки.
public class Ex4 {
    public static String addBinary(String a, String b) {
        int mem = 0;
        String result = "";

        while(a.length() > b.length()){
            b = "0" + b;
        }

        while(b.length() > a.length()){
            a = "0" + a;
        }


        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                result += (0 + mem);
                mem = 0;
            } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if(mem == 1)result += 1;
                else {
                    result += 0;
                    mem = 1;
                }
            } else{
                if (mem == 1) {
                    result += 0;
                    mem = 1;
                } else result += 1;
            }
        }

        if(mem == 1) result += 1;

        StringBuilder builder = new StringBuilder(result);
        return builder.reverse().toString();
    }
}
