package com.practice.streams;
import java.lang.String;
import java.util.stream.*;
import java.nio.file.*;
import java.io.IOException;

public class StreamsCSV {
    public static void main(String[] args) throws IOException {
        Stream<String> rows2 = Files.lines(Paths.get("src/com/practice/streams/data.txt"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
        rows2.close();
    }
}
