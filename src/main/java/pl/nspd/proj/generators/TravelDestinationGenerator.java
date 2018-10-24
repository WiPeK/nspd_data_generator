package pl.nspd.proj.generators;

import pl.nspd.proj.models.TravelDestination;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static pl.nspd.common.util.GeneratorUtil.id;
import static pl.nspd.proj.data.ContinentData.continentCountries;

public class TravelDestinationGenerator {
    public static Set<TravelDestination> generate() {
        Set<TravelDestination> travelDestinations = new HashSet<>();

        for (Map.Entry<String, Set<String>> continentCountry : continentCountries.entrySet()) {
            for (String country : continentCountry.getValue()) {
                travelDestinations.add(new TravelDestination(id(), continentCountry.getKey(), country));
            }
        }

        return travelDestinations;
    }
}
