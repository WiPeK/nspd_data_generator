package pl.nspd.generators;

import pl.nspd.models.Payment;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.generators.Generator.*;

public class PaymentGenerator {
    public static Set<Payment> generate() {
        return IntStream.range(0, 10001)
                .mapToObj(any -> new Payment(id(), payment()))
                .collect(Collectors.toSet());
    }
}
