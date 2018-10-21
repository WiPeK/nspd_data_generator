package pl.nspd.models;

import lombok.Data;

import java.time.LocalDate;


@Data
public class Employee {
    public final String id;
    public final String name;
    public final String surname;
    public final String address;
    public final String email;
    public final LocalDate dateOfEmployment;
    public final double salary;
}
