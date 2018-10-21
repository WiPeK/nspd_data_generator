package pl.nspd.generators;

import pl.nspd.models.Invoice;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.generators.Generator.*;

public class InvoiceGenerator {
    public static Set<Invoice> generate() {
        return IntStream.range(0, 50005)
                .mapToObj(any -> {
                    double price = randomPrice();
                    return new Invoice(id(), price, price * 0.23, discount(price));
                })
                .collect(Collectors.toSet());
    }

    private static double discount(double price) {
        if (price > 100 && price < 500) {
            return 10;
        } else if (price > 500 && price < 1000) {
            return 20;
        } else if (price > 1000) {
            return 30;
        } else {
            return 0;
        }
    }
}
