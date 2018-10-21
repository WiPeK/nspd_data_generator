package pl.nspd.generators;

import pl.nspd.models.Client;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.generators.Generator.*;

public class ClientGenrator {
    public static Set<Client> generate() {
        return IntStream.range(0, 10000)
                .mapToObj(any -> new Client(id(), name(), surname(), address(), phone(), email()))
                .collect(Collectors.toSet());
    }
}
