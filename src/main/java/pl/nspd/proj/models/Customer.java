package pl.nspd.proj.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Customer implements Model {
    public final String id;
    public final String name;
    public final String surname;
    public final String customerAddressId;

    @Override
    public String toCsv() {
        return id + SEPARATOR + name + SEPARATOR + surname + SEPARATOR + customerAddressId;
    }
}
