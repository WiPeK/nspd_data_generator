package pl.nspd.generators;

import pl.nspd.models.Employee;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.generators.Generator.*;

public class EmployeeGenerator {
    public static Set<Employee> generate() {
        return IntStream.range(0, 100)
                .mapToObj(any -> new Employee(id(), name(), surname(), address(), email(), randomDate(), randomSalary()))
                .collect(Collectors.toSet());
    }
}
