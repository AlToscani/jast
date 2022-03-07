package com.example.jast.s06;

import java.util.Comparator;
import java.util.List;

public class CoupleOfSorting {
    public static void main(String[] args) {
        List<Dog> dogs = List.of( //
                new Dog("Bob", "Robert Redford"), //
                new Dog("Al", "Val Kilmer"), //
                new Dog("Fido", "Andrew Scott") //
        );

        System.out.println("A few dogs: " + dogs);
        System.out.println("---");

        System.out.println("Sort the dogs, then print each of them");
        dogs.stream().sorted().forEach(System.out::println);
        System.out.println("---");

        System.out.println("Sort the dogs by owner, then print each of them");
        dogs.stream().sorted((l, r) -> l.owner().compareTo(r.owner())).forEach(System.out::println);
        System.out.println("---");

        System.out.println("Sort the dogs by owner using Comparator.comparing(), then print each of them");
        dogs.stream().sorted(Comparator.comparing(Dog::owner)).forEach(System.out::println);
        System.out.println("---");
    }
}
