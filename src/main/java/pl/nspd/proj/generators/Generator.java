package pl.nspd.proj.generators;

import pl.nspd.common.Constants;
import pl.nspd.proj.models.*;

import java.util.Random;
import java.util.Set;

import static pl.nspd.common.util.GeneratorUtil.randomFromArray;
import static pl.nspd.common.util.GeneratorUtil.randomFromSet;
import static pl.nspd.common.util.GeneratorUtil.randomTravelPrice;
import static pl.nspd.proj.data.BranchAddressData.branchesCountries;
import static pl.nspd.proj.data.CustomerAddressData.customersCities;
import static pl.nspd.proj.data.CustomerAddressData.customersCountries;
import static pl.nspd.proj.data.CustomerAddressData.customersStreets;
import static pl.nspd.proj.data.StreetsData.streets;

public class Generator {
    private static Random random = new Random();

    public static String branchCountry() {
        return randomFromArray(branchesCountries);
    }

    public static String customerCountry() {
        return randomFromArray(customersCountries);
    }

    public static String customerCity() {
        return randomFromArray(customersCities);
    }

    public static String customerStreet() {
        return randomFromArray(customersStreets);
    }

    public static String street() {
        return randomFromArray(streets);
    }

    public static String gender() {
        return random.nextBoolean() ? Constants.Gender.MALE.getValue() : Constants.Gender.FEMALE.getValue();
    }

    public static String destination(Set<TravelDestination> travelDestinations) {
        return randomFromSet(travelDestinations).id;
    }

    public static String startingPlace(Set<StartingPlace> startingPlaces) {
        return randomFromSet(startingPlaces).id;
    }

    public static String travelType(Set<TravelType> travelTypes) {
        return randomFromSet(travelTypes).id;
    }

    public static double price(int numberOfPersons) {
        return randomTravelPrice() * numberOfPersons;
    }

    public static int numberOfPersons() {
        int[] numbers = {
                1, 2, 4, 10, 20
        };
        return randomFromArray(numbers);
    }

    public static String day(Set<Day> days) {
        return randomFromSet(days).id;
    }

    public static Day dayObj(Set<Day> days) {
        return randomFromSet(days);
    }

    public static String month(Set<Month> months) {
        return randomFromSet(months).id;
    }

    public static String year(Set<Year> years) {
        return randomFromSet(years).id;
    }

    public static String employee(Set<Employee> employees) {
        return randomFromSet(employees).id;
    }

    public static String customer(Set<Customer> customers) {
        return randomFromSet(customers).id;
    }

    public static String travel(Set<Travel> travels) {
        return randomFromSet(travels).id;
    }

    public static BoughtChannel boughtChannel(Set<BoughtChannel> boughtChannels) {
        return randomFromSet(boughtChannels);
    }

    public static String paymentMethod(Set<PaymentMethod> paymentMethods) {
        return randomFromSet(paymentMethods).id;
    }

    public static int durationDays() {
        int[] numbers = {
                1, 2, 4, 7
        };
        return randomFromArray(numbers);
    }
}
