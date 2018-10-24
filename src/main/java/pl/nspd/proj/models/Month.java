package pl.nspd.proj.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Month implements Model {
    public final String id;
    public final int month;
    public final String yearId;

    @Override
    public String toCsv() {
        return id + SEPARATOR + month + SEPARATOR + yearId;
    }
}
