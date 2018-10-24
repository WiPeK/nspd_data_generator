package pl.nspd.proj.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Branch implements Model {
    public final String id;
    public final String name;
    public final String branchAddressId;

    @Override
    public String toCsv() {
        return id + SEPARATOR + name + SEPARATOR + branchAddressId;
    }
}
