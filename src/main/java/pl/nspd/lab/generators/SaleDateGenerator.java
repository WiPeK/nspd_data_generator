package pl.nspd.lab.generators;

import pl.nspd.lab.models.Month;
import pl.nspd.lab.models.*;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.lab.generators.Generator.*;
import static pl.nspd.common.util.GeneratorUtil.id;

public class SaleDateGenerator {

    public static Set<SaleDate> generate(Set<DayOfWeek> dayOfWeeks, Set<Quarter> quarters, Set<Month> months, Set<SaleYear> years) {
        return IntStream.range(0, 10001)
                .mapToObj(any -> new SaleDate(id(), randomDay(), dayOfWeek(dayOfWeeks), quarter(quarters), month(months), year(years)))
                .collect(Collectors.toSet());
    }
}
