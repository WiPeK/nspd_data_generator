package pl.nspd.models;

import lombok.Data;

import static pl.nspd.Constants.SEPARATOR;

@Data
public class Invoice implements Model {
    public final String id;
    public final double resultPrice;
    public final double taxValue;
    public final double discount;

    public String toCsv() {
        return id + SEPARATOR
                + resultPrice + SEPARATOR
                + taxValue + SEPARATOR
                + discount;
    }
}
