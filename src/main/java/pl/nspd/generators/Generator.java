package pl.nspd.generators;

import java.util.Random;
import java.util.UUID;

import static pl.nspd.data.AliasData.aliases;
import static pl.nspd.data.NameData.names;
import static pl.nspd.data.SurnameData.surnames;

public class Generator {
    private static Random random = new Random();

    public static String id() {
        return UUID.randomUUID().toString();
    }

    public static String name() {
        return randomFromArray(names);
    }

    public static String surname() {
        return randomFromArray(surnames);
    }

    public static String alias() {
        return randomFromArray(aliases);
    }

    private static String randomFromArray(String[] array) {
        return array[random.nextInt(array.length)];
    }
}
