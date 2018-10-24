package pl.nspd.common.util;

import java.util.Random;
import java.util.Set;
import java.util.UUID;

import static pl.nspd.common.data.NameData.names;
import static pl.nspd.common.data.SurnameData.surnames;

public class GeneratorUtil {
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

    public static <T> T randomFromSet(Set<T> set) {
        return set.stream().skip(Math.abs(random.nextInt() % set.size())).findFirst().get();
    }

    public static String randomFromArray(String[] array) {
        return array[random.nextInt(array.length)];
    }

    public static int randomFromArray(int[] array) {
        return array[random.nextInt(array.length)];
    }

    public static double randomSalary() {
        return 2000.00 + random.nextInt(2000) / 1.00;
    }

    public static double randomTravelPrice() {
        return 500.00 + random.nextInt(2000) / 1.00;
    }
}
