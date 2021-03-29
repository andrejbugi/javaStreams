package com.practice.streams;

import java.lang.String;
import java.util.stream.*;
import java.io.IOException;

public class IntegerSum {
    public static void main(String[] args) throws IOException {
        System.out.println(
        IntStream
            .range(1, 5)
            .sum());
        System.out.println();
    }
}
