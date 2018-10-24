package pl.nspd.proj.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class PaymentMethod implements Model {
    public final String id;
    public final String paymentMethod;

    @Override
    public String toCsv() {
        return id + SEPARATOR + paymentMethod;
    }
}
