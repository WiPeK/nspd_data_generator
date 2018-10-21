package pl.nspd.generators;

import pl.nspd.models.Author;
import pl.nspd.models.Category;
import pl.nspd.models.Producer;
import pl.nspd.models.Product;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.generators.Generator.*;

public class ProductGenerator {
    public static Set<Product> generate(Set<Category> categories, Set<Producer> producers, Set<Author> authors) {
        return IntStream.range(0, 1001)
                .mapToObj(any -> new Product(id(), category(categories), producer(producers), author(authors), productName(), randomPrice()))
                .collect(Collectors.toSet());
    }
}
