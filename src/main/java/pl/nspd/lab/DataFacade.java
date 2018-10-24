package pl.nspd.lab;

import pl.nspd.common.model.Model;
import pl.nspd.lab.models.Month;
import pl.nspd.lab.generators.*;
import pl.nspd.lab.models.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Set;

import static com.sun.activation.registries.LogSupport.log;
import static pl.nspd.common.util.CsvGenerator.createCsv;

public class DataFacade {

    private static Set<Quarter> quarters;
    private static Set<Author> authors;
    private static Set<Category> categories;
    private static Set<Channel> channels;
    private static Set<Client> clients;
    private static Set<DayOfWeek> dayOfWeeks;
    private static Set<SaleDate> saleDates;
    private static Set<SaleYear> years;
    private static Set<Month> months;
    private static Set<Employee> employees;
    private static Set<Producer> producers;
    private static Set<Payment> payments;
    private static Set<Product> products;
    private static Set<Invoice> invoices;
    private static Set<Sale> sales;

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
        SaleInvoice salesWIthInvoices = SaleGenerator.generate(clients, employees, saleDates, products, payments, channels);
        invoices = salesWIthInvoices.invoices;
        sales = salesWIthInvoices.sales;
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



}



