package pl.nspd.proj.generators;

import pl.nspd.proj.models.*;

import java.util.HashSet;
import java.util.Set;

public class TravelSalesGenerator {
    public static Set<TravelSale> generate(
        Set<Employee> employees,
        Set<Customer> customers,
        Set<Day> days,
        Set<Travel> travels,
        Set<BoughtChannel> boughtChannels,
        Set<PaymentMethod> paymentMethods
    ) {
        Set<TravelSale> travelSales = new HashSet<>();

        for (int i = 0; i < travels.size() - 433; i++) {

        }

        return travelSales;
    }
}
