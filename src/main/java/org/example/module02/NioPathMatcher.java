package org.example.module02;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;

public class NioPathMatcher {
    public static void main(String[] args) {
        PathMatcher matcher= FileSystems.getDefault()
                .getPathMatcher("glob:*.txt");

        Path archivo= Path.of("nota.txt");
        System.out.println(matcher.matches(archivo));
    }
}
