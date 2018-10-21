package pl.nspd.models;

import lombok.Data;

@Data
public class Product {
    public final String id;
    public final String categoryId;
    public final String producerId;
    public final String authorId;
    public final String name;
    public final double price;
}
