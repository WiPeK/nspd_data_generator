package pl.nspd.models;

import lombok.Data;

import static pl.nspd.Constants.SEPARATOR;

@Data
public class Client implements Model {
    public final String id;
    public final String name;
    public final String surname;
    public final String address;
    public final String phone;
    public final String email;

    public String toCsv() {
        return id + SEPARATOR
                + name + SEPARATOR
                + surname + SEPARATOR
                + address + SEPARATOR
                + phone + SEPARATOR
                + email;
    }
}
