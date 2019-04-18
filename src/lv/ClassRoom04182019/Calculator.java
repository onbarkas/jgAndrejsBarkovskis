package lv.ClassRoom04182019;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b).setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal divade(BigDecimal a, BigDecimal b) {
        return a.divide(b, new MathContext(3, RoundingMode.HALF_EVEN)).setScale(2);
    }
}
