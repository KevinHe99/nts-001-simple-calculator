package com.kevinhe99;

public class Calculator {

    public static Result add(int val1, int val2) {
        return new Result(val1 + val2, true);
    }

    public static Result subtract(int val1, int val2) {
        return new Result(val1 - val2, true);
    }

    public static Result multiply(int val1, int val2) {
        return new Result(val1 * val2, true);
    }

    public static Result divide(int val1, int val2) {
        if (val2 == 0) {
            return new Result(0, false);
        }

        return new Result(val1 / val2, true);
    }
}
