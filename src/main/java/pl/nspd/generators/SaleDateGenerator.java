package pl.nspd.generators;

import pl.nspd.models.*;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.generators.Generator.*;

public class SaleDateGenerator {

    public static Set<SaleDate> generate(Set<DayOfWeek> dayOfWeeks, Set<Quarter> quarters, Set<Month> months, Set<SaleYear> years) {
        return IntStream.range(0, 10001)
                .mapToObj(any -> new SaleDate(id(), randomDay(), dayOfWeek(dayOfWeeks), quarter(quarters), month(months), year(years)))
                .collect(Collectors.toSet());
    }
}
