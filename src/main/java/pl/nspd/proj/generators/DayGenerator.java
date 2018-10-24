package pl.nspd.proj.generators;

import pl.nspd.proj.models.Day;
import pl.nspd.proj.models.Month;

import java.util.HashSet;
import java.util.Set;
import static pl.nspd.common.util.GeneratorUtil.id;

public class DayGenerator {
    public static Set<Day> generate(Set<Month> months) {
        int dayNumber = 1;
        Set<Day> days = new HashSet<>();
        for (Month month : months) {
            days.add(new Day(id(), (dayNumber++)%28, month.id));
        }
        return days;
    }
}
