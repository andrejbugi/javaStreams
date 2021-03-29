package com.practice.streams;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;

public class StreamFromList {
    public static void main(String[] args) throws IOException {
        List<String> people = Arrays.asList("Al", "Andrej", "Brent", "Sarika", "Amanda", "Samara", "Marija");
        people
            .stream()
            .map(String::toLowerCase)
            .filter(x -> x.startsWith("a"))
            .forEach(System.out::println);
    }
}
