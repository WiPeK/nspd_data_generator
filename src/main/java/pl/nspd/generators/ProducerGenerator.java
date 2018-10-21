package pl.nspd.generators;

import pl.nspd.models.Producer;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.generators.Generator.*;

public class ProducerGenerator {
    public static Set<Producer> generate() {
        return IntStream.range(0, 100)
                .mapToObj(any -> new Producer(id(), name(), address()))
                .collect(Collectors.toSet());
    }
}
