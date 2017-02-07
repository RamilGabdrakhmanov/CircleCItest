package io.ramil.circlecitestapp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
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

    @Test
    public void isTwoIntFirsZero() throws Exception {
        assertFalse(someVefyCleverCalculator.isTwoIntEquals(0, 4));
        assertFalse(someVefyCleverCalculator.isTwoIntEquals(4, 0));
    }

    @Test
    public void isZeroTest() throws Exception {
        assertTrue(someVefyCleverCalculator.isZero(0));
        assertFalse(someVefyCleverCalculator.isZero(1));
    }

}