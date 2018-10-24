package pl.nspd.proj.generators;

import pl.nspd.proj.models.Month;
import pl.nspd.proj.models.Year;

import java.util.HashSet;
import java.util.Set;
import static pl.nspd.common.util.GeneratorUtil.id;

public class MonthGenerator {
    public static Set<Month> generate(Set<Year> years) {
        int monthNumber = 1;
        Set<Month> months = new HashSet<>();
        for (Year year : years) {
            months.add(new Month(id(), (monthNumber++)%12, year.id));
        }
        return months;
    }
}
