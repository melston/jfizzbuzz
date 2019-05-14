package com.elsoft.jfizzbuzz;

public class JFizzBuzz1a {

    public static void main(String[] args) {
        for (int ii=1; ii< 21; ii++) {
            System.out.println(calcFB(ii));
        }
    }

    private static String calcFB(int val) {
        if (val%15 == 0)     return "fizzbuzz";
        else if (val%5 == 0) return "buzz";
        else if (val%3 == 0) return "fizz";
        else                 return Integer.toString(val);
    }

}
