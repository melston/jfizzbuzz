package com.elsoft.jfizzbuzz.utils;

public class Pair {
    public int value;
    public String acc;

    public Pair(int v, String a) {value = v; acc = a;}
    public String toString() {
        if (acc.length() != 0) return acc;
        else return Integer.toString(value);
    }
}
