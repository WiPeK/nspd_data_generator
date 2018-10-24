package pl.nspd.proj.generators;

import pl.nspd.proj.models.Year;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static pl.nspd.common.util.GeneratorUtil.id;

public class YearGenerator {
    public static Set<Year> generate() {
        return IntStream.range(2013, 2018)
                .mapToObj(val -> new Year(id(), val))
                .collect(Collectors.toSet());
    }
}
