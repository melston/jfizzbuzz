package com.elsoft.jfizzbuzz;

import java.util.function.Function;
import com.elsoft.jfizzbuzz.utils.Pair;
import com.elsoft.jfizzbuzz.utils.UtilFns;

public class JFizzBuzz3a {

    public static void main(String[] args) {
        for (int ii=1; ii< 21; ii++) {
            System.out.println(calcFB(ii));
        }
    }

    private static Function<Pair, Pair> genFB(int div, String divStr) {
        return (Pair curr) -> (curr.value%div == 0) ? new Pair(curr.value, curr.acc + divStr) : curr;
    }

    private static String calcFB(int val) {
        Pair p = new Pair(val, "");

        p = UtilFns.genFB(3, "fizz").apply(p);
        p = UtilFns.genFB(5, "buzz").apply(p);

        return p.toString();
    }
}
