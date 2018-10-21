package pl.nspd.generators;

import pl.nspd.models.*;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.generators.Generator.*;

public class SaleGenerator {
    public static Set<Sale> generate(
            Set<Client> clients,
            Set<Employee> employees,
            Set<SaleDate> saleDates,
            Set<Product> products,
            Set<Payment> payments,
            Set<Channel> channels,
            Set<Invoice> invoices) {
        return IntStream.range(0, 10001)
                .mapToObj(any ->
                        new Sale(
                                id(),
                                client(clients),
                                employee(employees),
                                saleDate(saleDates),
                                product(products),
                                payment(payments),
                                channel(channels),
                                quantity(),
                                invoice(invoices)))
                .collect(Collectors.toSet());
    }
}
