package pl.nspd.models;

import lombok.Data;

@Data
public class Author {
    public final String id;
    public final String name;
    public final String surname;
    public final String alias;
}
