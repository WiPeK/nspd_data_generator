package pl.nspd.lab.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Channel implements Model {
    public final String id;
    public final String type;

    public String toCsv() {
        return id + SEPARATOR + type;
    }
}
