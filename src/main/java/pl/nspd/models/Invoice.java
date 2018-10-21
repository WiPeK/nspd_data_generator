package pl.nspd.models;

import lombok.Data;

@Data
public class Invoice {
    public final String id;
    public final double resultPrice;
    public final double taxValue;
    public final double discount;
}
