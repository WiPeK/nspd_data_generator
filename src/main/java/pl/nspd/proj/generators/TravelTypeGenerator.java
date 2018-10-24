package pl.nspd.proj.generators;

import pl.nspd.proj.models.TravelType;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static pl.nspd.proj.data.TravelTypeData.travelTypes;
import static pl.nspd.common.util.GeneratorUtil.id;

public class TravelTypeGenerator {
    public static Set<TravelType> generate() {
        return Arrays.stream(travelTypes)
                .map(type -> new TravelType(id(), type))
                .collect(Collectors.toSet());
    }
}
