package pl.nspd.common.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalUtil {
    private static final int decimalPlaces = 2;

    public static double round(double value) {
        return new BigDecimal(value).setScale(decimalPlaces, RoundingMode.HALF_UP).doubleValue();
    }
}
