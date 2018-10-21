package pl.nspd.models;

import lombok.Data;

@Data
public class Sale {
    public final String id;
    public final String clientId;
    public final String employeeId;
    public final String saleDateId;
    public final String productId;
    public final String paymentId;
    public final String channelId;
    public final int quantity;
    public final String invoiceId;
}
