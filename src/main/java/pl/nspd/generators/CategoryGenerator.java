package pl.nspd.generators;

import pl.nspd.models.Category;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static pl.nspd.data.CategoryData.categories;

public class CategoryGenerator {
    public static Set<Category> generate() {
        return Arrays.stream(categories)
                .map(category -> new Category(Generator.id(), category))
                .collect(Collectors.toSet());
    }
}
