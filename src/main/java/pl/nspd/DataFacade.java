package pl.nspd;

import pl.nspd.generators.*;
import pl.nspd.models.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Set;

import static com.sun.activation.registries.LogSupport.log;

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
        createCsv((Set<Model>) (Object) quarters, "quarters");
        createCsv((Set<Model>) (Object) authors, "authors");
        createCsv((Set<Model>) (Object) categories, "categories");
        createCsv((Set<Model>) (Object) channels, "channels");
        createCsv((Set<Model>) (Object) clients, "clients");
        createCsv((Set<Model>) (Object) dayOfWeeks, "dayOfWeeks");
        createCsv((Set<Model>) (Object) months, "months");
        createCsv((Set<Model>) (Object) years, "years");
        createCsv((Set<Model>) (Object) saleDates, "saleDates");
        createCsv((Set<Model>) (Object) employees, "employees");
        createCsv((Set<Model>) (Object) producers, "producers");
        createCsv((Set<Model>) (Object) payments, "payments");
        createCsv((Set<Model>) (Object) products, "products");
        createCsv((Set<Model>) (Object) invoices, "invoices");
        createCsv((Set<Model>) (Object) sales, "sales");
    }

    private void createCsv(Set<Model> models, String name) {
        File dir = makeBaseDir();
        try (PrintWriter out = new PrintWriter(dir + "/" + name + ".csv")) {
            models.forEach(model -> out.println(model.toCsv()));
        } catch (FileNotFoundException x) {
            log(x.toString());
        }
    }

    private File makeBaseDir() {
        File dir = new File("CSV files");
        dir.mkdir();
        return dir;
    }

}



