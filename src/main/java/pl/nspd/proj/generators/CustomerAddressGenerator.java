package pl.nspd.proj.generators;

import pl.nspd.proj.models.CustomerAddress;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static pl.nspd.common.util.GeneratorUtil.id;
import static pl.nspd.proj.generators.Generator.customerCity;
import static pl.nspd.proj.generators.Generator.customerCountry;
import static pl.nspd.proj.generators.Generator.customerStreet;

public class CustomerAddressGenerator {
    public static Set<CustomerAddress> generate() {
        return IntStream.range(0, 5000)
                .mapToObj(any -> new CustomerAddress(id(), customerCountry(), customerCity(), customerStreet()))
                .collect(Collectors.toSet());
    }
}
