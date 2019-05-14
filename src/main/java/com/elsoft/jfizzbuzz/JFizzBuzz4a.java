package com.elsoft.jfizzbuzz;

import com.elsoft.jfizzbuzz.utils.Pair;
import com.elsoft.jfizzbuzz.utils.UtilFns;

import java.util.function.Function;
import java.util.stream.Stream;

public class JFizzBuzz4a {

    public static void main(String[] args) {

        Function<Pair, Pair> do3 = UtilFns.genFB(3, "fizz");
        Function<Pair, Pair> do5 = UtilFns.genFB(5, "buzz");

        Stream.iterate(1, i -> i + 1)
                .map(UtilFns::createPair)
                .map(do3)
                .map(do5)
                .map((p) -> p.toString())
                .limit(21)
                .forEach(System.out::println);
    }

}
