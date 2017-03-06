/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marlynconsultingltd.fizzbuzz;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 *
 * @author martinwarnett
 */
@DisplayName("ParametersValidator tests")
@RunWith(JUnitPlatform.class)
public final class ParametersTest {
    private static final int START = 67;
    private static final int END = 34;
    
    private Parameters testSubject;
    
    @BeforeEach
    public void setUp() {
        testSubject = new Parameters(START, END);
    }
    
    @DisplayName("Start parameter should be unaltered")
    @Test
    public void checkStartParameterUnaltered() {
        assertEquals(START, testSubject.getStart());
    }

    @DisplayName("End parameter should be unaltered")
    @Test
    public void checkEndParameterUnaltered() {
        assertEquals(END, testSubject.getStart());
    }
}
