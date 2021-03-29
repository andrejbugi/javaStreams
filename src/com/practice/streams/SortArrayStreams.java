package com.practice.streams;
import java.lang.String;
import java.util.Arrays;
import java.io.IOException;

public class SortArrayStreams {
    public static void main(String[] args) throws IOException {
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Andrej", "Samara"};
        Arrays.stream(names)
            .filter(x -> x.startsWith("S"))
            .sorted()
            .forEach(System.out::println);
    }
}
