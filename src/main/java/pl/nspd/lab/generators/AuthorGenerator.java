package pl.nspd.lab.generators;

import pl.nspd.lab.models.Author;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.common.util.GeneratorUtil.name;
import static pl.nspd.common.util.GeneratorUtil.surname;
import static pl.nspd.lab.generators.Generator.*;
import static pl.nspd.common.util.GeneratorUtil.id;

public class AuthorGenerator {
    public static Set<Author> generate() {
        return IntStream.range(0, 1000)
                .mapToObj(any -> new Author(id(), name(), surname(), alias()))
                .collect(Collectors.toSet());
    }
}
