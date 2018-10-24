package pl.nspd.lab.generators;

import pl.nspd.lab.models.Category;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static pl.nspd.lab.data.CategoryData.categories;
import static pl.nspd.common.util.GeneratorUtil.id;

public class CategoryGenerator {
    public static Set<Category> generate() {
        return Arrays.stream(categories)
                .map(category -> new Category(id(), category))
                .collect(Collectors.toSet());
    }
}
