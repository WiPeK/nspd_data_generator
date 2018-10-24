package pl.nspd.proj.generators;

import pl.nspd.proj.models.Branch;
import pl.nspd.proj.models.Employee;

import java.util.Set;
import java.util.stream.Collectors;

import static pl.nspd.common.util.GeneratorUtil.*;
import static pl.nspd.proj.generators.Generator.gender;

public class EmployeeGenerator {
    public static Set<Employee> generate(Set<Branch> branches) {
        return branches.stream()
                .map(branch -> new Employee(id(), name(), surname(), gender(), randomSalary(), branch.id))
                .collect(Collectors.toSet());
    }
}
