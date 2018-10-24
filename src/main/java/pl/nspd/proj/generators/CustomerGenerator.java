package pl.nspd.proj.generators;

import pl.nspd.proj.models.Customer;
import pl.nspd.proj.models.CustomerAddress;

import java.util.Set;
import java.util.stream.Collectors;

import static pl.nspd.common.util.GeneratorUtil.id;
import static pl.nspd.common.util.GeneratorUtil.name;
import static pl.nspd.common.util.GeneratorUtil.surname;

public class CustomerGenerator {
    public static Set<Customer> generate(Set<CustomerAddress> customerAddresses) {
        return customerAddresses.stream()
            .map(address -> new Customer(id(), name(), surname(), address.id))
            .collect(Collectors.toSet());
    }
}
