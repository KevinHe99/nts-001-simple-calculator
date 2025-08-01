package com.kevinhe99;

public class Calculator {

    public static Result add(double val1, double val2) {
        return new Result(val1 + val2, true);
    }

    public static Result subtract(double val1, double val2) {
        return new Result(val1 - val2, true);
    }

    public static Result multiply(double val1, double val2) {
        return new Result(val1 * val2, true);
    }

    public static Result divide(double val1, double val2) {
        if (val2 == 0) {
            return new Result(0, false);
        }

        return new Result(val1 / val2, true);
    }
}
