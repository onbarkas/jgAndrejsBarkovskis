package lv.ClassRoom04182019;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator victim;


    @Before
    public void setUp() throws Exception {
        victim = new Calculator();
    }

    @Test
    public void shouldSumTwoValues() {
        int sum = victim.sum(3, 6);
        assertEquals(9, sum);
    }

    @Test
    public void shouldMultiplyTwoFloatingValues() {
        BigDecimal result = victim.multiply(
                BigDecimal.valueOf(3), BigDecimal.valueOf(4));

        assertEquals(new BigDecimal("12.00"), result);
    }

    @Test
    public void shouldDevideTwoFloatingValues() {
        BigDecimal result = victim.divade(BigDecimal.valueOf(6d), BigDecimal.valueOf(3d));

        assertEquals(new BigDecimal("2.00"), result);
    }
}