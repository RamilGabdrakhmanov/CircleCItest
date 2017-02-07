package io.ramil.circlecitestapp;

/**
 * Created by ramilgabdrakhmanov on 2/7/17.
 */

public class SomeVefyCleverCalculator {

    public boolean isTwoIntEquals(int a, int b) {
        if (a != 0) {
            if (b != 0) {
                return a == b;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
