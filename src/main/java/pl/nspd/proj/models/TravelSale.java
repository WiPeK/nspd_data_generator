package pl.nspd.proj.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class TravelSale implements Model {
    public final String id;
    public final String employeeId;
    public final String customerId;
    public final String dayId;
    public final String travelId;
    public final String boughtChannelId;
    public final String paymentMethodId;
    public final double totalPrice;

    @Override
    public String toCsv() {
        return
                id +
                        SEPARATOR +
                        employeeId +
                        SEPARATOR +
                        customerId +
                        SEPARATOR +
                        dayId +
                        SEPARATOR +
                        travelId +
                        SEPARATOR +
                        boughtChannelId +
                        SEPARATOR +
                        paymentMethodId +
                        SEPARATOR +
                        totalPrice;
    }
}
