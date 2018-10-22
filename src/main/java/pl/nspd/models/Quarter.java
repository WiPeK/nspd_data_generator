package pl.nspd.models;

import lombok.Data;

import static pl.nspd.Constants.SEPARATOR;

@Data
public class Quarter implements Model {
    public final int id;
    public final int numberOfQuarter;

    public String toCsv() {
        return id + SEPARATOR + numberOfQuarter;
    }
}
