package com.elsoft.jfizzbuzz;

import com.elsoft.jfizzbuzz.utils.Pair;
import com.elsoft.jfizzbuzz.utils.UtilFns;

import java.util.function.Function;

public class JFizzBuzz3b {

    public static void main(String[] args) {
        for (int ii=1; ii< 21; ii++) {
            System.out.println(calcFB(ii));
        }
    }

    private static String calcFB(int val) {
        Pair p = new Pair(val, "");

        Function<Pair, Pair> do3 = UtilFns.genFB(3, "fizz");
        Function<Pair, Pair> do5 = UtilFns.genFB(5, "buzz");

        p = do3.apply(p);
        p = do5.apply(p);

        return p.toString();
    }
}
