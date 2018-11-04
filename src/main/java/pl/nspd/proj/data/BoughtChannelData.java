package pl.nspd.proj.data;

import lombok.Getter;

public enum BoughtChannelData {
    BRANCH("BRANCH"),
    ONLINE("ONLINE"),
    PHONE("PHONE"),
    OTHERS("OTHERS");

    @Getter
    private final String value;

    BoughtChannelData(String value) {
        this.value = value;
    }

    public static final String[] boughtChannels = {
      BRANCH.getValue(),
      ONLINE.getValue(),
      PHONE.getValue(),
      OTHERS.getValue()
    };
}
