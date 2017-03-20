package com.marlynconsultingltd.fizzbuzz.validation;

import com.marlynconsultingltd.fizzbuzz.Parameters;
import com.marlynconsultingltd.fizzbuzz.validation.ParameterValidator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


/**
 * Provides unit tests for the {@link ParameterValidator} class.
 *
 * @author martinwarnett
 */
@DisplayName("ParametersValidator tests")
@RunWith(JUnitPlatform.class)
public final class ParameterValidatorTest {

    private ParameterValidator testSubject;
    
    @BeforeEach
    public void setUp() {
        testSubject = new ParameterValidator();
    }
    

    @DisplayName("An exception should be thrown when no parameters are present")
    @Test
    public void checkExceptionThrownWhenNoParameters() {
        final Throwable exception = assertThrows(IllegalArgumentException.class,
                     () -> testSubject.validateAndAssignParameters(null));
        assertEquals("The application expects two parameters, start and end, to be provided. No parameters were provided", 
                     exception.getMessage());
    }

    @DisplayName("An exception should be thrown when incorrect number of parameters are present")
    @Test
    public void expectExceptionWhenIncorrectNumberOfParameters() {
        final Throwable noArgsException = assertThrows(IllegalArgumentException.class,
                                           () -> testSubject.validateAndAssignParameters(new String[] {}));
        assertEquals("The application expects two parameters, start and end, to be provided. No parameters were provided", 
                     noArgsException.getMessage());
          
        final Throwable oneArgException = assertThrows(IllegalArgumentException.class,
                     () -> testSubject.validateAndAssignParameters(new String[]{"1"}));
        assertEquals("The application expects two parameters, start and end, to be provided. Number of parameters supplied was 1", 
                     oneArgException.getMessage());
        
        final Throwable threeArgsException = assertThrows(IllegalArgumentException.class,
                     () -> testSubject.validateAndAssignParameters(new String[]{"2", "3", "4"}));
        assertEquals("The application expects two parameters, start and end, to be provided. Number of parameters supplied was 3", 
                     threeArgsException.getMessage());
    }
    
    @DisplayName("An exception should be thrown when start parameter is non-numeric")
    @Test
    public void expectExceptionWhenStartParameterIsCharacter() {
        final Throwable exception = assertThrows(IllegalArgumentException.class,
                     () -> testSubject.validateAndAssignParameters(new String[]{"abc", "2"}));
        assertEquals("The start and end parameters must be numeric integers - start was 'abc' and end was '2'", 
                     exception.getMessage());
    }

    @DisplayName("An exception should be thrown when start parameter is not integer")
    @Test
    public void expectExceptionWhenStartParameterIsNotInteger() {
        final Throwable exception = assertThrows(IllegalArgumentException.class,
                     () -> testSubject.validateAndAssignParameters(new String[]{"1.1", "2"}));
        assertEquals("The start and end parameters must be numeric integers - start was '1.1' and end was '2'", 
                     exception.getMessage());
    }

    
    @DisplayName("An exception should be thrown when end parameter is non-numeric")
    @Test
    public void expectExceptionWhenEndParameterIsCharacter() {
        final Throwable exception = assertThrows(IllegalArgumentException.class,
                     () -> testSubject.validateAndAssignParameters(new String[]{"3", "xyz"}));
        assertEquals("The start and end parameters must be numeric integers - start was '3' and end was 'xyz'", 
                     exception.getMessage());
    }

    @DisplayName("An exception should be thrown when end parameter is not integer")
    @Test
    public void expectExceptionWhenEndParameterIsNotInteger() {
        final Throwable exception = assertThrows(IllegalArgumentException.class,
                     () -> testSubject.validateAndAssignParameters(new String[]{"4", "5.1"}));
        assertEquals("The start and end parameters must be numeric integers - start was '4' and end was '5.1'", 
                     exception.getMessage());
    }


    @DisplayName("An exception should be thrown when end parameter smaller than start parameter")
    @Test
    public void expectExceptionWhenEndParameterSmallerThanStartParameter() {
        final Throwable exception = assertThrows(IllegalArgumentException.class,
                     () -> testSubject.validateAndAssignParameters(new String[]{"10", "9"}));
        assertEquals("The start parameter must be greater than the parameter - start was '10' and end was '9'", 
                     exception.getMessage());
    }

    @DisplayName("An exception should be thrown when end parameter equals start parameter")
    @Test
    public void expectExceptionWhenEndParameterEqualsStartParameter() {
        final Throwable exception = assertThrows(IllegalArgumentException.class,
                     () -> testSubject.validateAndAssignParameters(new String[]{"11", "11"}));
        assertEquals("The start parameter must be greater than the parameter - start was '11' and end was '11'", 
                     exception.getMessage());
    }

    @DisplayName("Valid parameters should not cause exception")
    @Test
    public void exceptionNotThrownUponValidParameters() {
        try {
            final Parameters parameters = testSubject.validateAndAssignParameters(new String[]{"1", "2"});
            assertEquals(1, parameters.getStart());
            assertEquals(2, parameters.getEnd());
        } catch (Exception e) {
            fail("No exception should be thrown");
        }
    }
}
