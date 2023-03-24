package org.lessons.calculator.tester;

public interface Calculator {
    public static float add(float addends1, float addends2) throws IllegalArgumentException{
        if (addends1 < 0 || addends2 < 0){
            throw new IllegalArgumentException("Addend must be positive.");
        }
        float sum = addends1 + addends2;
        return sum;
    }

    public static float subtract(float minuend, float subtrahend) throws IllegalArgumentException, ArithmeticException{
        if (minuend < 0) {
            throw new IllegalArgumentException("Minuend must be positive.");
        }
        if (subtrahend < 0) {
            throw new IllegalArgumentException("Subtrahend must be positive.");
        }
        if (subtrahend > minuend) {
            throw new ArithmeticException("Subtrahend must be <= of the minuend.");
        }
        float difference = minuend - subtrahend;
        return difference;
    }

    public  static float divide(float dividend, float divisor) throws IllegalArgumentException, ArithmeticException{
        if (dividend < 0) {
            throw new IllegalArgumentException("Dividend must be positive.");
        }
        if (divisor < 0) {
            throw new IllegalArgumentException("Divisor must be positive.");
        }
        if (dividend < divisor) {
            throw new ArithmeticException("Divisor must be <= of the dividend.");
        }
        float quotient = dividend/divisor;
        return quotient;
    }

    public static float multiply(float factor1, float factor2) throws IllegalArgumentException{
        if (factor1 < 0 || factor2 < 0) {
            throw new IllegalArgumentException("Factor must be positive.");
        }
        float product = factor1*factor2;
        return product;
    }

}
