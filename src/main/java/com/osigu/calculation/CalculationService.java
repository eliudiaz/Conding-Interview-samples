package com.osigu.calculation;

import java.math.BigDecimal;

/**
 * Created by eliud on 6/9/2017.
 */
public class CalculationService {
    public static final String ADD = "ADD";
    public static final String SUBSTRACT = "SUBSTRACT";


    public BigDecimal calculate(BigDecimal one, BigDecimal two, String operation) {
        switch (operation) {
            case ADD:
                return one.add(two);
            case SUBSTRACT:
                return one.subtract(two);
            default:
                throw new RuntimeException("unsupported exception");
        }


    }
}
