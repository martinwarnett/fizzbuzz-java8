package com.marlynconsultingltd.fizzbuzz.validation;

/**
 *
 * @author martinwarnett
 */
public final class ParameterValidator {

    private static final String POSITIVE_INTEGERS_REQUIRED = "The start and end parameters must be positive numeric integers - start was '%s' and end was '%s'";
    private static final String END_PARAMETER_SMALLER_THAN_START = "The end parameter cannot be smaller than the start parameter - start was %d and end was %d";
    private static final String TWO_PARAMETERS_REQUIRED = "The application expects two parameters, start and end, to be provided. Number of parameters supplied was %d";
    private static final String NO_PARAMETERS = "The application expects two parameters, start and end, to be provided. No parameters were provided";

    public void validate(final String[] args) {
        if (null == args || args.length == 0) {
            throw new IllegalArgumentException(
                    NO_PARAMETERS);
        }

        if (args.length != 2) {
            throw new IllegalArgumentException(
                    String.format(TWO_PARAMETERS_REQUIRED, args.length));
        }

        try {
            int start = Integer.parseInt(args[0]);
            int end = Integer.parseInt(args[1]);

            if (start <= 0 || end <= 0) {
                throw new IllegalArgumentException(
                        String.format(POSITIVE_INTEGERS_REQUIRED, start, end));
            }
            
            if (end < start) {
                throw new IllegalArgumentException(
                        String.format(END_PARAMETER_SMALLER_THAN_START, start, end));
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                    String.format(POSITIVE_INTEGERS_REQUIRED, args[0], args[1]), e);
        }
    }
}
