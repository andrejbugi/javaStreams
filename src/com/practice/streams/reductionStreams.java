package com.practice.streams;
import java.lang.String;
import java.util.stream.*;
import java.io.IOException;

public class reductionStreams {
    public static void main(String[] args) throws IOException {
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total = " + total);
    }
}
