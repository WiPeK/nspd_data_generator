package pl.nspd.proj;

import pl.nspd.proj.generators.*;
import pl.nspd.proj.models.*;

import java.util.Set;

public class ProjFacade {

    private static Set<BoughtChannel> boughtChannels;
    private static Set<Branch> branches;
    private static Set<BranchAddress> branchAddresses;
    private static Set<Customer> customers;
    private static Set<CustomerAddress> customerAddresses;
    private static Set<Day> days;
    private static Set<Employee> employees;
    private static Set<Month> months;
    private static Set<PaymentMethod> paymentMethods;
    private static Set<StartingPlace> startingPlaces;
    private static Set<Travel> travels;
    private static Set<TravelDestination> travelDestinations;
    private static Set<TravelSale> travelSales;
    private static Set<TravelType> travelTypes;
    private static Set<Year> years;

    public void generate() {
        generateData();
        generateCsv();
    }

    private void generateData() {
        years = YearGenerator.generate();
        months = MonthGenerator.generate(years);
        days = DayGenerator.generate(months);
        boughtChannels = BoughtChannelGenerator.generate();
        branchAddresses = BranchAddressGenerator.generate();
        branches = BranchGenerator.generate(branchAddresses);
        employees = EmployeeGenerator.generate(branches);
        employees.addAll(EmployeeGenerator.generate(branches));
        customerAddresses = CustomerAddressGenerator.generate();
        customers = CustomerGenerator.generate(customerAddresses);
        travelTypes = TravelTypeGenerator.generate();
        travelDestinations = TravelDestinationGenerator.generate();
        startingPlaces = StartingPlaceGenerator.generate(branchAddresses);
        paymentMethods = PaymentMethodGenerator.generate();
        travels = TravelGenerator.generate(travelDestinations, travelTypes, startingPlaces, days, months, years);
        travelSales = TravelSalesGenerator.generate(employees, customers, days, months, years, travels, boughtChannels, paymentMethods);
    }

    private void generateCsv() {

    }
}
