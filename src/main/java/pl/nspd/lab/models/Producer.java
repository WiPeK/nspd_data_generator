package pl.nspd.lab.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Producer implements Model {
    public final String id;
    public final String name;
    public final String address;

    public String toCsv() {
        return id + SEPARATOR + name.replace(",", "") + SEPARATOR + address.replace(",", "");
    }
}
