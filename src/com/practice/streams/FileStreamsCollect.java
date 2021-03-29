package com.practice.streams;
import java.lang.String;
import java.util.stream.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class FileStreamsCollect {
    public static void main(String[] args) throws IOException {
        List<String> names2 = Files.lines(Paths.get("src/com/practice/streams/names.txt"))
            .filter(x -> x.contains("ndr"))
            .collect(Collectors.toList());
        names2.forEach(x -> System.out.println(x));
    }
}
