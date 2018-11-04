package pl.nspd.lab.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Author implements Model {
    public final String id;
    public final String name;
    public final String surname;
    public final String alias;

    public String toCsv() {
        return id + SEPARATOR + surname + SEPARATOR + alias;
    }
}
