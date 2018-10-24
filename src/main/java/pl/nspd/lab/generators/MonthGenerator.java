package pl.nspd.lab.generators;

import pl.nspd.lab.models.Month;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.lab.data.MonthData.months;

public class MonthGenerator {
    public static Set<Month> generate() {
        return IntStream.range(1, 13)
                .mapToObj(val -> new Month(val, months[val-1]))
                .collect(Collectors.toSet());
    }
}
