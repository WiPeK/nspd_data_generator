package pl.nspd.models;

import lombok.Data;

import static pl.nspd.Constants.SEPARATOR;

@Data
public class Month implements Model {
    public final int id;
    public final String month;

    public String toCsv() {
        return id + SEPARATOR + month;
    }
}
