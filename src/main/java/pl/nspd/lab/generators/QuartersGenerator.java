package pl.nspd.lab.generators;

import pl.nspd.lab.models.Quarter;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QuartersGenerator {
    public static Set<Quarter> generate() {
        return IntStream.range(1, 5)
                .mapToObj(val -> new Quarter(val, val))
                .collect(Collectors.toSet());
    }
}
