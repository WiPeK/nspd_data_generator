package pl.nspd.models;

import lombok.Data;

import static pl.nspd.Constants.SEPARATOR;

@Data
public class DayOfWeek implements Model {
    public final int id;
    public final String name;

    public String toCsv() {
        return id + SEPARATOR + name;
    }
}
