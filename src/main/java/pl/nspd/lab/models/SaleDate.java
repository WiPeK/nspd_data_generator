package pl.nspd.lab.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class SaleDate implements Model {
    public final String id;
    public final int day;
    public final int dayOfWeek;
    public final int quarterId;
    public final int monthId;
    public final String yearId;

    public String toCsv() {
        return id + SEPARATOR
                + day + SEPARATOR
                + dayOfWeek + SEPARATOR
                + quarterId + SEPARATOR
                + monthId + SEPARATOR
                + yearId;
    }
}
