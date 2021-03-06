package pl.nspd.proj.generators;

import pl.nspd.proj.models.Day;
import pl.nspd.proj.models.Month;

import java.util.HashSet;
import java.util.Set;

import static pl.nspd.common.util.GeneratorUtil.id;

public class DayGenerator {
    public static Set<Day> generate(Set<Month> months) {
        Set<Day> days = new HashSet<>();
        for (Month month : months) {
            for (int i = 0; i < 28; i++) {
                days.add(new Day(id(), i + 1, month.id));
            }
        }
        return days;
    }
}
