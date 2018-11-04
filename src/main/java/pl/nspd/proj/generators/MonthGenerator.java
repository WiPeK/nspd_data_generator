package pl.nspd.proj.generators;

import pl.nspd.proj.models.Month;
import pl.nspd.proj.models.Year;

import java.util.HashSet;
import java.util.Set;
import static pl.nspd.common.util.GeneratorUtil.id;

public class MonthGenerator {
    public static Set<Month> generate(Set<Year> years) {
        Set<Month> months = new HashSet<>();
        for (Year year : years) {
            for (int i = 0; i < 12; i++) {
                months.add(new Month(id(), i+1, year.id));
            }
        }
        return months;
    }
}
