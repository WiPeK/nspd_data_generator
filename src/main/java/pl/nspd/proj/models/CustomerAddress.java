package pl.nspd.proj.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class CustomerAddress implements Model {
    public final String id;
    public final String country;
    public final String city;
    public final String street;

    @Override
    public String toCsv() {
        return id + SEPARATOR + country + SEPARATOR + city + SEPARATOR + street;
    }
}
