package com.elsoft.jfizzbuzz.utils;

import java.util.function.Function;

public class UtilFns {
    public static Function<Pair, Pair> genFB(int div, String divStr) {
        return (Pair curr) -> (curr.value%div == 0) ? new Pair(curr.value, curr.acc + divStr) : curr;
    }

    public static Pair createPair(int val) {
        return new Pair(val, "");
    }
}
