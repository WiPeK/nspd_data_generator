package pl.nspd.generators;

import pl.nspd.models.Author;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.generators.Generator.*;

public class AuthorGenerator {
    public static Set<Author> generate() {
        return IntStream.range(0, 1000)
                .mapToObj(any -> new Author(id(), name(), surname(), alias()))
                .collect(Collectors.toSet());
    }
}
