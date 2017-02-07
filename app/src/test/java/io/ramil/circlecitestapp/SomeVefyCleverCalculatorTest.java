package io.ramil.circlecitestapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by ramilgabdrakhmanov on 2/7/17.
 */
public class SomeVefyCleverCalculatorTest {

    SomeVefyCleverCalculator someVefyCleverCalculator;

    @Before
    public void init() {
        someVefyCleverCalculator = new SomeVefyCleverCalculator();
    }

    @Test
    public void isTwoIntEquals() throws Exception {
        assertTrue(someVefyCleverCalculator.isTwoIntEquals(4, 4));
    }
}