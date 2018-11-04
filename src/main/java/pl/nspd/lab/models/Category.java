package pl.nspd.lab.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Category implements Model {
    public final String id;
    public final String name;

    public String toCsv() {
        return id.replace(",", "") + SEPARATOR + name.replace(",", "");
    }
}
