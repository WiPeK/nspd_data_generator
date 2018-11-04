package pl.nspd.lab.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;
import static pl.nspd.common.util.DecimalUtil.round;

@Data
public class Invoice implements Model {
    public final String id;
    public final double resultPrice;
    public final double taxValue;
    public final double discount;

    public String toCsv() {
        return id
                + SEPARATOR
                + round(resultPrice) + SEPARATOR
                + round(taxValue) + SEPARATOR
                + round(discount);
    }
}
