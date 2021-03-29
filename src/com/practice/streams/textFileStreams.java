package com.practice.streams;
import java.lang.String;
import java.util.stream.*;
import java.nio.file.*;
import java.io.IOException;

public class textFileStreams {
    public static void main(String[] args) throws IOException {
        Stream<String> names = Files.lines(Paths.get("src/com/practice/streams/names.txt"));
        names
            .sorted()
            .filter(x -> x.length() > 13)
            .forEach(System.out::println);
        names.close();
    }
}
