package pl.nspd.proj.models;

import lombok.Data;
import pl.nspd.common.model.Model;

import java.time.LocalDate;

import static pl.nspd.common.Constants.SEPARATOR;

@Data
public class Travel implements Model {
    public final String id;
    public final int numberOfPersons;
    public final double price;
    public final LocalDate startDate;
    public final LocalDate endDate;
    public final String travelDestinationId;
    public final String startingPlaceId;
    public final String travelTypeId;

    @Override
    public String toCsv() {
        return id +
                SEPARATOR +
                numberOfPersons +
                SEPARATOR +
                price +
                SEPARATOR +
                startDate +
                SEPARATOR +
                endDate +
                SEPARATOR +
                travelDestinationId +
                SEPARATOR +
                startingPlaceId +
                SEPARATOR +
                travelTypeId;
    }
}
