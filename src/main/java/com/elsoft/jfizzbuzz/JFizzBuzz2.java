package com.elsoft.jfizzbuzz;

public class JFizzBuzz2 {

    public static void main(String[] args) {
        for (int ii=1; ii< 21; ii++) {
            System.out.println(calcFB(ii));
        }
    }

    private static String addStr(String acc, int div, String divStr, int value) {
        if (value%div == 0) return acc + divStr;
        else return acc;
    }

    private static String calcFB(int val) {
        String accStr = "";

        accStr = addStr(accStr,3, "fizz", val);
        accStr = addStr(accStr,5, "buzz", val);

        if (accStr.length() == 0) accStr = Integer.toString(val);

        return accStr;
    }
}
