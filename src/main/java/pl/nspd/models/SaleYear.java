package pl.nspd.models;

import lombok.Data;

import static pl.nspd.Constants.SEPARATOR;

@Data
public class SaleYear implements Model {
    public final String id;
    public final int year;

    public String toCsv() {
        return id + SEPARATOR + year;
    }
}
