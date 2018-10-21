package pl.nspd;

import pl.nspd.generators.*;
import pl.nspd.models.*;

import java.util.Set;

public class DataFacade {

    public static Set<Quarter> quarters;
    public static Set<Author> authors;
    public static Set<Category> categories;
    public static Set<Channel> channels;
    public static Set<Client> clients;
    public static Set<DayOfWeek> dayOfWeeks;
    public static Set<SaleDate> saleDates;
    public static Set<SaleYear> years;
    public static Set<Month> months;
    public static Set<Employee> employees;
    public static Set<Producer> producers;
    public static Set<Payment> payments;
    public static Set<Product> products;
    public static Set<Invoice> invoices;
    public static Set<Sale> sales;

    public void generate() {
        generateData();
        generateCsv();
    }

    private void generateData() {
        quarters = QuartersGenerator.generate();
        authors = AuthorGenerator.generate();
        categories = CategoryGenerator.generate();
        channels = ChannelGenerator.generate();
        clients = ClientGenrator.generate();
        dayOfWeeks = DayOfWeekGenerator.generate();
        years = YearGenerator.generate();
        months = MonthGenerator.generate();
        saleDates = SaleDateGenerator.generate(dayOfWeeks, quarters, months, years);
        employees = EmployeeGenerator.generate();
        producers = ProducerGenerator.generate();
        payments = PaymentGenerator.generate();
        products = ProductGenerator.generate(categories, producers, authors);
        invoices = InvoiceGenerator.generate();
        sales = SaleGenerator.generate(clients, employees, saleDates, products, payments, channels, invoices);
    }

    private void generateCsv() {
        // todo jak się da to refleksją jechać po kolekcji i każdy objekt.getDeclaredField.value split ','
    }

}
