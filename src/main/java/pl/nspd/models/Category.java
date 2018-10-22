package pl.nspd.models;

import lombok.Data;

import static pl.nspd.Constants.SEPARATOR;

@Data
public class Category implements Model {
    public final String id;
    public final String name;

    public String toCsv() {
        return id + SEPARATOR + name;
    }
}
