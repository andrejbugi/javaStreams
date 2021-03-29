package com.practice.streams;
import java.lang.String;
import java.util.stream.*;
import java.io.IOException;

public class SortingStream {
    public static void main(String[] args) throws IOException {
        Stream.of("Andrej", "Marija", "Zoran")
            .sorted()
            .findFirst()
            .ifPresent(System.out::println);
    }
}
