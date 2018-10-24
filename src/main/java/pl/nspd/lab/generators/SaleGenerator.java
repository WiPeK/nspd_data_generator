package pl.nspd.lab.generators;

import pl.nspd.lab.models.*;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.lab.generators.Generator.*;

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
                                Generator.product(products),
                                payment(payments),
                                channel(channels),
                                quantity(),
                                invoice(invoices)))
                .collect(Collectors.toSet());
    }

    public static SaleInvoice generate(
            Set<Client> clients,
            Set<Employee> employees,
            Set<SaleDate> saleDates,
            Set<Product> products,
            Set<Payment> payments,
            Set<Channel> channels) {
        Set<Invoice> invoices = new HashSet<>();
        Set<Sale> sales = new HashSet<>();

        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            int itemsPerInvoice = random.nextInt(5) + 1;

            Set<Product> invoiceProducts = new HashSet<>();

            for (int j = 0; j < itemsPerInvoice; j++) {
                invoiceProducts.add(product(products));
            }
            double price = resultPrice(invoiceProducts);
            Invoice invoice = new Invoice(id(), price, price * 0.23, discount(price));
            invoices.add(invoice);
            sales.addAll(IntStream.range(0, itemsPerInvoice)
                .mapToObj(any -> new Sale(
                        id(),
                        client(clients),
                        employee(employees),
                        saleDate(saleDates),
                        Generator.product(products),
                        payment(payments),
                        channel(channels),
                        quantity(),
                        invoice.id))
            .collect(Collectors.toSet()));
        }

        return new SaleInvoice(sales, invoices);
    }

    private static double resultPrice(Set<Product> products) {
        return products.stream()
                .mapToDouble(product -> product.price)
                .sum();
    }

    private static Product product(Set<Product> products) {
        return randomFromSet(products);
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
