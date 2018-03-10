package com.jbisht.blogs.java9.usingoptional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo {

    public static void main(String[] args) {
        // Java 9 style
        getPerson().stream()
                .map(Person::getName)
                .map("Java 9 "::concat)
                .forEach(System.out::println);

        getEmptyPerson().stream()
                .map(Person::getName)
                .map("Java 9 "::concat)
                .forEach(System.out::println);

        // Java 8 Style
        getPerson()
                .map(Stream::of).orElseGet(Stream::empty)
                .map(Person::getName)
                .map("Java 8 - "::concat)
                .forEach(System.out::println);
    }

    private static Optional<Person> getEmptyPerson() {
        return Optional.empty();
    }

    private static Optional<Person> getPerson() {
        return Optional.of(new Person("JITENDRA SINGH"));
    }

    static class Person {

        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
