package pl.nspd.proj.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class TravelDestination implements Model {
    public final String id;
    public final String continent;
    public final String country;

    @Override
    public String toCsv() {
        return id + SEPARATOR + continent + SEPARATOR + country;
    }
}
