package com.elsoft.jfizzbuzz;

public class JFizzBuzz2 {

    public static void main(String[] args) {
        for (int ii=1; ii< 21; ii++) {
            System.out.println(calcFB(ii));
        }
    }

    private static String addStr(String acc, int value, int div, String divStr) {
        if (value%div == 0) return acc + divStr;
        else return acc;
    }

    private static String calcFB(int val) {
        String accStr = "";

        accStr = addStr(accStr, val, 3, "fizz");
        accStr = addStr(accStr, val, 5, "buzz");
        accStr = addStr(accStr, val, 7, "bang");
        accStr = addStr(accStr, val, 11, "boom");

        if (accStr.length() == 0) accStr = Integer.toString(val);

        return accStr;
    }
}
