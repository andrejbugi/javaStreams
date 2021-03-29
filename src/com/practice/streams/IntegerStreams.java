package com.practice.streams;
import java.lang.String;
import java.util.stream.*;
import java.io.IOException;

public class IntegerStreams {
    public static void main(String[] args) throws IOException {
        IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println();
    }
}
