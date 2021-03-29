package com.practice.streams;
import java.lang.String;
import java.util.stream.*;
import java.io.IOException;

public class IntegerStreams2 {
    public static void main(String[] args) throws IOException {

        IntStream
            .range(1, 10)
            .skip(5)
            .forEach(x -> System.out.println(x));
        System.out.println();
    }
}
