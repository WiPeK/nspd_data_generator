package pl.nspd.lab.generators;

import pl.nspd.lab.models.SaleYear;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class YearGenerator {
    public static Set<SaleYear> generate() {
        return IntStream.range(2010, 2019)
                .mapToObj(val -> new SaleYear(Generator.id(), val))
                .collect(Collectors.toSet());
    }
}
