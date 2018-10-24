package pl.nspd.lab.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Sale implements Model {
    public final String id;
    public final String clientId;
    public final String employeeId;
    public final String saleDateId;
    public final String productId;
    public final String paymentId;
    public final String channelId;
    public final int quantity;
    public final String invoiceId;

    public String toCsv() {
        return id + SEPARATOR
                + channelId + SEPARATOR
                + employeeId + SEPARATOR
                + saleDateId + SEPARATOR
                + productId + SEPARATOR
                + paymentId + SEPARATOR
                + channelId + SEPARATOR
                + quantity + SEPARATOR
                + invoiceId;
    }
}
