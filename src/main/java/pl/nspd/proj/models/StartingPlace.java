package pl.nspd.proj.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class StartingPlace implements Model {
    public final String id;
    public final String city;
    public final String street;

    @Override
    public String toCsv() {
        return id + SEPARATOR + city + SEPARATOR + street;
    }
}
