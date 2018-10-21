package pl.nspd.models;

import lombok.Data;

@Data
public class SaleDate {
    public final String id;
    public final int day;
    public final int dayOfWeek;
    public final int quarterId;
    public final int monthId;
    public final String yearId;
}
