package pl.nspd.proj.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Year implements Model {
    public final String id;
    public final int year;

    @Override
    public String toCsv() {
        return id + SEPARATOR + year;
    }
}
