package pl.nspd.models;

import lombok.Data;

@Data
public class Client {
    public final String id;
    public final String name;
    public final String surname;
    public final String address;
    public final String phone;
    public final String email;
}
