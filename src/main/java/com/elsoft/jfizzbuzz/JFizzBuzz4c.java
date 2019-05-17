package com.elsoft.jfizzbuzz;

import com.elsoft.jfizzbuzz.utils.Pair;
import com.elsoft.jfizzbuzz.utils.UtilFns;

import java.util.function.Function;
import java.util.stream.Stream;

public class JFizzBuzz4c {

    static Function<Pair, Pair> do3 = UtilFns.genFB(3, "fizz");
    static Function<Pair, Pair> do5 = UtilFns.genFB(5, "buzz");
    static Function<Pair, Pair> do7  = UtilFns.genFB(7, "bang");
    static Function<Pair, Pair> do11 = UtilFns.genFB(11, "boom");
    static Function<Integer, Pair> init = UtilFns::createPair;  // (i) -> UtilFns.createPair(i);
    static Function<Pair, String> str   = Pair::toString;       // (p) -> p.toString();

    public static void main(String[] args) {

        Function<Integer, String> composed =
                init.andThen(do3).andThen(do5).andThen(do7).andThen(do11).andThen(str);

        Stream.iterate(1, i -> i + 1)
                .map(composed)
                .limit(105)
                .forEach(System.out::println);
    }
}
