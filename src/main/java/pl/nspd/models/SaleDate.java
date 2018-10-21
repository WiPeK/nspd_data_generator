package pl.nspd.models;

import lombok.Data;

@Data
public class SaleDate {
    public final String id;
    public final int day;
    public final String dayOfWeek;
    public final String quarterId;
    public final String monthId;
    public final String yearId;
}
