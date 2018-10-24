package pl.nspd.lab.generators;

import pl.nspd.lab.models.Client;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.common.util.GeneratorUtil.name;
import static pl.nspd.common.util.GeneratorUtil.surname;
import static pl.nspd.lab.generators.Generator.*;
import static pl.nspd.common.util.GeneratorUtil.id;

public class ClientGenrator {
    public static Set<Client> generate() {
        return IntStream.range(0, 10000)
                .mapToObj(any -> new Client(id(), name(), surname(), address(), phone(), email()))
                .collect(Collectors.toSet());
    }
}
