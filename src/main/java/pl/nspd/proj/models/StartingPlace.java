package pl.nspd.proj.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class StartingPlace implements Model {
    private final String id;
    private final String continent;
    private final String country;

    @Override
    public String toCsv() {
        return id + SEPARATOR + continent + SEPARATOR + country;
    }
}
