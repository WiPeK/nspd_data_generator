package pl.nspd.generators;

import pl.nspd.models.DayOfWeek;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.data.DaysNamesData.daysNames;

public class DayOfWeekGenerator {
    public static Set<DayOfWeek> generate() {
        return IntStream.range(1, 8)
                .mapToObj(val -> new DayOfWeek(val, daysNames[val-1]))
                .collect(Collectors.toSet());
    }
}
