package com.mycompany.app;

public class Sqrt {
    double delta = 0.00000001;
    double arg;

    public Sqrt(double arg) {
        this.arg = arg;
    }

    public double average(double x, double y) {
        return (x + y) / 2.0;
    }

    public boolean good(double guess, double x) {
        return Math.abs(guess * guess - x) < delta;
    }

    public double improve(double guess, double x) {
        return average(guess, x / guess);
    }

    public double iter(double guess, double x) {
        if (good(guess, x))
            return guess;
        else
            return iter(improve(guess, x), x);
    }

    public double calc() {
        if (arg < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number");
        }
        if (arg == 0) return 0;
        if (arg == 1) return 1;
        return iter(arg / 2, arg);
    }
}
