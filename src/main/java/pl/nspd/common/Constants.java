package pl.nspd.common;

import lombok.Getter;

public class Constants {
    public final static String SEPARATOR = ",";

    public static enum Gender {
        MALE("M"),
        FEMALE("F");

        @Getter
        private final String value;

        Gender(String value) {
            this.value = value;
        }
    }
}
