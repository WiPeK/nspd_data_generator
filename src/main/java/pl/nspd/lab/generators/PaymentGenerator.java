package pl.nspd.lab.generators;

import pl.nspd.lab.models.Payment;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.lab.generators.Generator.*;
import static pl.nspd.common.util.GeneratorUtil.id;

public class PaymentGenerator {
    public static Set<Payment> generate() {
        return IntStream.range(0, 10001)
                .mapToObj(any -> new Payment(id(), payment()))
                .collect(Collectors.toSet());
    }
}
