package pl.nspd.models;

import lombok.Data;

import static pl.nspd.Constants.SEPARATOR;

@Data
public class Author implements Model {
    public final String id;
    public final String name;
    public final String surname;
    public final String alias;

    public String toCsv() {
        return id + SEPARATOR + id + SEPARATOR + surname + SEPARATOR + alias;

    }
}
