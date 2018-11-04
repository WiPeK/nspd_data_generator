package pl.nspd.lab.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Month implements Model {
    public final int id;
    public final String month;

    public String toCsv() {
        return id + SEPARATOR + month.replace(",", "");
    }
}
