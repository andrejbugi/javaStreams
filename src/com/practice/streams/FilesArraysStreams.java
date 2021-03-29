package com.practice.streams;
import java.lang.String;
import java.util.stream.*;
import java.nio.file.*;
import java.io.IOException;

public class FilesArraysStreams {
    public static void main(String[] args) throws IOException {
        Stream<String> rows1 = Files.lines(Paths.get("src/com/practice/streams/data.txt"));
        int rowCount = (int)rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();
    }
}
