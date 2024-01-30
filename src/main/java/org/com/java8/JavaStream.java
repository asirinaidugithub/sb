package org.com.java8;

import org.com.beans.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("asirinaidu", "patnana", "asiri");
        List<Student> students = Arrays.asList(new Student("100", "patnana", 450), new Student("101", "asiri", 400), new Student("103", "naidu", 500), new Student("104", "asirinaidu", 550), new Student("105", "patna naidu", 300));
//        boxing(names);
        sorting(names);

    }

    public static void boxing(List<String> names) {
        names.stream().map(item -> item.length()).forEach(System.out::println);
        names.stream().mapToInt(item -> item.length()).boxed().collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void sorting(List<String> names) {
        names.stream().sorted().forEach(System.out::println);
        System.out.println("-------");
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("-------");
        names.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        System.out.println("-------");
        names.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(System.out::println);
    }

    public static void minMax(List<Student> students) {

    }
}
