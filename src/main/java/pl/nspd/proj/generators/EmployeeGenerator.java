package pl.nspd.proj.generators;

import pl.nspd.proj.models.Employee;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.nspd.common.util.GeneratorUtil.*;
import static pl.nspd.proj.generators.Generator.gender;

public class EmployeeGenerator {
    public static Set<Employee> generate() {
        return IntStream.range(0, 32)
                .mapToObj(any -> new Employee(id(), name(), surname(), gender(), randomSalary()))
                .collect(Collectors.toSet());
    }
}
