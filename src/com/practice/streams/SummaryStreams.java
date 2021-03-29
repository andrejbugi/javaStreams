package com.practice.streams;
import java.lang.String;
import java.util.stream.*;
import java.io.IOException;
import java.util.*;

public class SummaryStreams {
    public static void main(String[] args) throws IOException {
        IntSummaryStatistics summary = IntStream.of(7, 3, 18, 50, 81, 70, 22, 10)
                .summaryStatistics();
        System.out.println(summary);
    }
}
