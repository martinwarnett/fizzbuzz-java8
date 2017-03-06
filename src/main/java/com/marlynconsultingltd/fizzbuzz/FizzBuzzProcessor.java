package com.marlynconsultingltd.fizzbuzz;

import java.util.stream.IntStream;

/**
 *
 * @author martinwarnett
 */
public final class FizzBuzzProcessor {

    public void process(final Parameters parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("No parameters were provided");
        }
        IntStream.range(parameters.getStart(), parameters.getEnd()).forEach(i -> processFizzBuzzElement(i));
    }

    private void processFizzBuzzElement(final int value) {
        System.out.println(value + " ");
        if (value % 3 == 0) {
            System.out.println("fizz");
        }
        if (value % 5 == 0) {
            System.out.println("buzz");
        }
        System.out.println("\n");
    }
}
