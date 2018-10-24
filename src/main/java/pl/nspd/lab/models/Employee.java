package pl.nspd.lab.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import java.time.LocalDate;

import static pl.nspd.common.Constants.SEPARATOR;
import static pl.nspd.common.util.DecimalUtil.round;


@Data
public class Employee implements Model {
    public final String id;
    public final String name;
    public final String surname;
    public final String address;
    public final String email;
    public final LocalDate dateOfEmployment;
    public final double salary;

    public String toCsv() {
        return id + SEPARATOR
                + name + SEPARATOR
                + surname + SEPARATOR
                + address + SEPARATOR
                + email + SEPARATOR
                + dateOfEmployment + SEPARATOR
                + round(salary);
    }
}
