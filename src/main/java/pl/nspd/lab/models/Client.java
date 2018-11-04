package pl.nspd.lab.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Client implements Model {
    public final String id;
    public final String name;
    public final String surname;
    public final String address;
    public final String phone;
    public final String email;

    public String toCsv() {
        return id.replace(",", "") +
                SEPARATOR
                + name.replace(",", "") + SEPARATOR
                + surname.replace(",", "") + SEPARATOR
                + address.replace(",", "") + SEPARATOR
                + phone.replace(",", "") + SEPARATOR
                + email.replace(",", "");
    }
}
