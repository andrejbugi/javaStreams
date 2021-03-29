package com.practice.streams;
import java.lang.String;
import java.util.stream.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class HashMapStreams {
    public static void main(String[] args) throws IOException {
        Stream<String> rows3 = Files.lines(Paths.get("src/com/practice/streams/data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])));
        rows3.close();
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
