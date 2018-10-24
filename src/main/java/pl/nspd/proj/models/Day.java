package pl.nspd.proj.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Day implements Model {
    public final String id;
    public final int day;
    public final String monthId;

    @Override
    public String toCsv() {
        return id + SEPARATOR + day + SEPARATOR + monthId;
    }
}
