package pl.nspd.lab.generators;

import pl.nspd.lab.models.Month;
import pl.nspd.lab.models.*;

import java.time.LocalDate;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import static pl.nspd.common.data.AddressData.addresses;
import static pl.nspd.common.util.GeneratorUtil.randomFromArray;
import static pl.nspd.common.util.GeneratorUtil.randomFromSet;
import static pl.nspd.lab.data.AliasData.aliases;
import static pl.nspd.lab.data.EmailData.emails;
import static pl.nspd.common.data.NameData.names;
import static pl.nspd.common.data.PaymentData.paymentTypes;
import static pl.nspd.lab.data.PhoneData.phones;
import static pl.nspd.lab.data.ProductNameData.productNames;
import static pl.nspd.common.data.SurnameData.surnames;

public class Generator {
    private static Random random = new Random();

    public static String alias() {
        return randomFromArray(aliases);
    }

    public static String address() {
        return randomFromArray(addresses);
    }

    public static String phone() {
        return randomFromArray(phones);
    }

    public static String email() {
        return randomFromArray(emails);
    }

    public static String payment() {
        return randomFromArray(paymentTypes);
    }

    public static String productName() {
        return randomFromArray(productNames);
    }

    public static int dayOfWeek(Set<DayOfWeek> daysOfWeek) {
        return randomFromSet(daysOfWeek).id;
    }

    public static int quarter(Set<Quarter> quarters) {
        return randomFromSet(quarters).id;
    }

    public static int month(Set<Month> months) {
        return randomFromSet(months).id;
    }

    public static String year(Set<SaleYear> years) {
        return randomFromSet(years).id;
    }

    public static String category(Set<Category> categories) {
        return randomFromSet(categories).id;
    }

    public static String producer(Set<Producer> producers) {
        return randomFromSet(producers).id;
    }

    public static String author(Set<Author> authors) {
        return randomFromSet(authors).id;
    }

    public static String client(Set<Client> clients) {
        return randomFromSet(clients).id;
    }

    public static String employee(Set<Employee> employees) {
        return randomFromSet(employees).id;
    }

    public static String saleDate(Set<SaleDate> saleDates) {
        return randomFromSet(saleDates).id;
    }

    public static String product(Set<Product> products) {
        return randomFromSet(products).id;
    }

    public static String payment(Set<Payment> payments) {
        return randomFromSet(payments).id;
    }

    public static String channel(Set<Channel> channels) {
        return randomFromSet(channels).id;
    }

    public static String invoice(Set<Invoice> invoices) {
        return randomFromSet(invoices).id;
    }

    public static int randomDay() {
        return random.nextInt(28);
    }

    public static LocalDate randomDate() {
        long minDay = LocalDate.of(2010, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2018, 10, 21).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        return LocalDate.ofEpochDay(randomDay);
    }

    public static double randomPrice() {
        return 1.00 + random.nextInt(2000) / 1.00;
    }

    public static int quantity() {
        return 1 + random.nextInt(100);
    }


}
