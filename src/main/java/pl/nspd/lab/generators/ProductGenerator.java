package pl.nspd.lab.generators;

import pl.nspd.lab.models.Author;
import pl.nspd.lab.models.Category;
import pl.nspd.lab.models.Producer;
import pl.nspd.lab.models.Product;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.lab.generators.Generator.*;

public class ProductGenerator {
    public static Set<Product> generate(Set<Category> categories, Set<Producer> producers, Set<Author> authors) {
        return IntStream.range(0, 1001)
                .mapToObj(any -> new Product(id(), category(categories), producer(producers), author(authors), productName(), randomPrice()))
                .collect(Collectors.toSet());
    }
}
