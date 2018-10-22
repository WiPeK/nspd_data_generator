package pl.nspd.models;

import lombok.Data;

import static pl.nspd.Constants.SEPARATOR;

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
