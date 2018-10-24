package pl.nspd.lab.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Quarter implements Model {
    public final int id;
    public final int numberOfQuarter;

    public String toCsv() {
        return id + SEPARATOR + numberOfQuarter;
    }
}
