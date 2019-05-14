package com.elsoft.jfizzbuzz;

public class JFizzBuzz1b {

    public static void main(String[] args) {
        for (int ii=1; ii< 21; ii++) {
            System.out.println(calcFB(ii));
        }
    }

    private static String calcFB(int val) {
        if (val % 105 == 0)     return "fizzbuzzbang"; // 3*5*7
        else if (val % 35 == 0) return "buzzbang"; // 5*7
        else if (val % 21 == 0) return "fizzbang"; // 3*7
        else if (val % 15 == 0) return "fizzbuzz";
        else if (val % 7 == 0)  return "bang";      // 7
        else if (val % 5 == 0)  return "buzz";
        else if (val % 3 == 0)  return "fizz";
        else                    return Integer.toString(val);
    }

    private static String calcFB35711(int val) {
        if (val % 1155 == 0)     return "fizzbuzzbangboom"; // 3 * 5 * 7 * 11
        else if (val % 385 == 0) return "buzzbangboom"; // 5 * 7 * 11
        else if (val % 231 == 0) return "fizzbangboom"; // 3 * 7 * 11
        else if (val % 165 == 0) return "fizzbuzzboom"; // 3 * 5 * 11
        else if (val % 105 == 0) return "fizzbuzzbang";
        else if (val % 77 == 0)  return "bangboom";      // 7 * 11
        else if (val % 55 == 0)  return "buzzboom";      // 5 * 11
        else if (val % 35 == 0)  return "buzzbang";
        else if (val % 33 == 0)  return "fizzboom";      // 3 * 11
        else if (val % 21 == 0)  return "fizzbang";
        else if (val % 15 == 0)  return "fizzbuzz";
        else if (val % 11 == 0)  return "boom";          // 11
        else if (val % 7 == 0)   return "bang";      // 7
        else if (val % 5 == 0)   return "buzz";
        else if (val % 3 == 0)   return "fizz";
        else                     return Integer.toString(val);
    }

    // Next handle 13, 3*13, 5*13, 7*13, 11*13, 3*5*13, 3*7*13, 3*11*13, 5*7*13,
    //             5*11*13, 7*11*13, 3*5*7*13, 3*5*11*13, 5*7*11*13, 3*5*7*11*13
    // (15 additional cases: total = 30 + 1)

}
