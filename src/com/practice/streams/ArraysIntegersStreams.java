package com.practice.streams;
import java.lang.String;
import java.util.Arrays;
import java.io.IOException;

public class ArraysIntegersStreams {
    public static void main(String[] args) throws IOException {
        Arrays.stream(new int[] {2, 4, 6, 8, 10, 12})
            .map(x -> x * x)
            .average()
            .ifPresent(System.out::println);
    }
}
