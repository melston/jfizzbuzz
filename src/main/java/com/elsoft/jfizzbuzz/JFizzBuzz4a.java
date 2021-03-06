package com.elsoft.jfizzbuzz;

import com.elsoft.jfizzbuzz.utils.Pair;
import com.elsoft.jfizzbuzz.utils.UtilFns;

import java.util.function.Function;
import java.util.stream.Stream;

public class JFizzBuzz4a {
    static Function<Pair, Pair> do3 = UtilFns.genFB(3, "fizz");
    static Function<Pair, Pair> do5 = UtilFns.genFB(5, "buzz");
    static Function<Pair, Pair> do7  = UtilFns.genFB(7, "bang");
    static Function<Pair, Pair> do11 = UtilFns.genFB(11, "boom");

    public static void main(String[] args) {

        Stream.iterate(1, i -> i + 1)
                .map((i) -> new Pair(i, ""))
                .map(do3)
                .map(do5)
                .map(do7)
                .map(do11)
                .map(Pair::toString)  // .map((p) -> p.toString())
                .limit(105)
                .forEach(System.out::println);
    }

}
