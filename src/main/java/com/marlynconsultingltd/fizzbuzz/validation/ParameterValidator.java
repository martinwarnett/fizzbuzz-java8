package com.marlynconsultingltd.fizzbuzz.validation;

import com.marlynconsultingltd.fizzbuzz.Parameters;
import java.util.Optional;

/**
 *
 * @author martinwarnett
 */
public final class ParameterValidator {

    private static final String INTEGERS_REQUIRED = "The start and end parameters must be numeric integers - start was '%s' and end was '%s'";
    private static final String END_PARAMETER_NOT_GREATER_THAN_START = "The start parameter must be greater than the parameter - start was '%d' and end was '%d'";
    private static final String TWO_PARAMETERS_REQUIRED = "The application expects two parameters, start and end, to be provided. Number of parameters supplied was %d";
    private static final String NO_PARAMETERS = "The application expects two parameters, start and end, to be provided. No parameters were provided";

    public Parameters validateAndAssignParameters(final String[] args) {
        Parameters parameters = null;
        
        if (null == args || args.length == 0) {
            throw new IllegalArgumentException(NO_PARAMETERS);
        }

        if (args.length != 2) {
            throw new IllegalArgumentException(
                    String.format(TWO_PARAMETERS_REQUIRED, args.length));
        }

        try {
            int start = Integer.parseInt(args[0]);
            int end = Integer.parseInt(args[1]);

            if (end <= start) {
                throw new IllegalArgumentException(
                        String.format(END_PARAMETER_NOT_GREATER_THAN_START, start, end));
            }
            
            parameters = new Parameters(start, end);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                    String.format(INTEGERS_REQUIRED, args[0], args[1]), e);
        }
        
        return parameters;
    }
}
