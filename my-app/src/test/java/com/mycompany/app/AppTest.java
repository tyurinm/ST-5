package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(2.0, sqrt.average(1.0, 3.0), 1e-10);
    }

    @Test
    public void testAverageWithNegativeNumbers() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(0.5, sqrt.average(-1.0, 2.0), 1e-10);
    }

    @Test
    public void testGoodTrue() {
        Sqrt sqrt = new Sqrt(4);
        assertTrue(sqrt.good(2, 4));
    }

    @Test
    public void testGoodFalse() {
        Sqrt sqrt = new Sqrt(4);
        assertFalse(sqrt.good(3, 4));
    }

    @Test
    public void testDeltaPrecision() {
        Sqrt sqrt = new Sqrt(2);
        assertTrue(sqrt.good(1.41421356, 2));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(2.5, sqrt.improve(1.0, 4.0), 1e-10);
    }

    @Test
    public void testIterConverges() {
        Sqrt sqrt = new Sqrt(16);
        assertEquals(4.0, sqrt.iter(1.0, 16), 1e-10);
    }

    @Test
    public void testIterWithLargeNumber() {
        Sqrt sqrt = new Sqrt(1000000);
        assertEquals(1000.0, sqrt.iter(1.0, 1000000), 1e-10);
    }

    @Test
    public void testIterWithLargeGuess() {
        Sqrt sqrt = new Sqrt(1000000);
        assertEquals(1000.0, sqrt.iter(10000.0, 1000000), 1e-10);
    }

    @Test
    public void testCalc() {
        Sqrt sqrt = new Sqrt(25);
        assertEquals(5.0, sqrt.calc(), 1e-10);
    }

    @Test
    public void testCalcZero() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(0.0, sqrt.calc(), 1e-10);
    }

    @Test
    public void testCalcOne() {
        Sqrt sqrt = new Sqrt(1);
        assertEquals(1.0, sqrt.calc(), 1e-10);
    }

    @Test
    public void testCalcLargeNumber() {
        Sqrt sqrt = new Sqrt(1e+12);
        assertEquals(1e+6, sqrt.calc(), 1e-10);
    }

    @Test
    public void testCalcWithDecimal() {
        Sqrt sqrt = new Sqrt(2.25);
        assertEquals(1.5, sqrt.calc(), 1e-10);
    }

    @Test
    public void testCalcWithNegativeNumber() {
        Sqrt sqrt = new Sqrt(-4);
        assertThrows(IllegalArgumentException.class, sqrt::calc);
    }
}
