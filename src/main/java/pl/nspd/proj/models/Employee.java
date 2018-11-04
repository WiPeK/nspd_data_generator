package pl.nspd.proj.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Employee implements Model {
    public final String id;
    public final String name;
    public final String surname;
    public final String gender;
    public final double salary;

    @Override
    public String toCsv() {
        return id +
                SEPARATOR +
                name +
                SEPARATOR +
                surname +
                SEPARATOR +
                gender +
                SEPARATOR +
                salary;
    }
}
