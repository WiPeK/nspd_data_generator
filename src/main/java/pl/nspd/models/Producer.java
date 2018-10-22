package pl.nspd.models;

import lombok.Data;

import static pl.nspd.Constants.SEPARATOR;

@Data
public class Producer implements Model {
    public final String id;
    public final String name;
    public final String address;

    public String toCsv() {
        return id + SEPARATOR + name + SEPARATOR + address;
    }
}
