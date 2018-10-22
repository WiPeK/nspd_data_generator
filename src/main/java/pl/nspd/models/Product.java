package pl.nspd.models;

import lombok.Data;
import pl.nspd.util.DecimalUtil;

import static pl.nspd.Constants.SEPARATOR;

@Data
public class Product implements Model {
    public final String id;
    public final String categoryId;
    public final String producerId;
    public final String authorId;
    public final String name;
    public final double price;

    public String toCsv() {
        return id + SEPARATOR
                + categoryId + SEPARATOR
                + producerId + SEPARATOR
                + authorId + SEPARATOR
                + name + SEPARATOR
                + DecimalUtil.round(price);
    }
}
