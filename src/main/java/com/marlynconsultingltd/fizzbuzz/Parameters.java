/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marlynconsultingltd.fizzbuzz;

/**
 *
 * @author martinwarnett
 */
public class Parameters {
    private int start;
    private int end;
    
    public Parameters(final int start, final int end) {
        this.start = start;
        this.end = end;
    }

    /**
     * @return the start
     */
    public int getStart() {
        return start;
    }

    /**
     * @return the end
     */
    public int getEnd() {
        return end;
    }
}
