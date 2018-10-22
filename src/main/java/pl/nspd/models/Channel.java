package pl.nspd.models;

import lombok.Data;

import static pl.nspd.Constants.SEPARATOR;

@Data
public class Channel implements Model {
    public final String id;
    public final String type;

    public String toCsv() {
        return id + SEPARATOR + type;
    }
}
