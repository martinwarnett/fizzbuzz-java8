package com.marlynconsultingltd.fizzbuzz;

import java.util.function.Predicate;

public final class FizzBuzzPredicates {
    public static Predicate<Integer> isFizz() {
        return number -> number != 0 && number % 3 == 0 ;
    }

    public static Predicate<Integer> isBuzz() {
        return number -> number != 0 && number % 5 == 0 ;
    }
}
