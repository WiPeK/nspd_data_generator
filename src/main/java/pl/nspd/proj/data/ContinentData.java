package pl.nspd.proj.data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContinentData {

    public static final Map<String, Set<String>> continentCountries = new HashMap<>();

    {
        Set<String> northAmericaCountries = new HashSet<>();
        northAmericaCountries.add("USA");
        northAmericaCountries.add("CANADA");

        continentCountries.put("NORTH AMERICA", northAmericaCountries);

        Set<String> southAmericaCountries = new HashSet<>();
        southAmericaCountries.add("BRASIL");
        southAmericaCountries.add("COLUMBIA");

        continentCountries.put("SOUTH AMERICA", southAmericaCountries);

        Set<String> europeCountries = new HashSet<>();
        europeCountries.add("SPAIN");
        europeCountries.add("FRANCE");
        europeCountries.add("GREECE");
        europeCountries.add("ITALY");
        europeCountries.add("CROATIA");
        europeCountries.add("ALBANIA");
        europeCountries.add("ISLAND");
        europeCountries.add("NORWAY");

        continentCountries.put("EUROPE", europeCountries);

        Set<String> asiaCountries = new HashSet<>();
        asiaCountries.add("CHINA");
        asiaCountries.add("JAPAN");
        asiaCountries.add("THAILAND");

        continentCountries.put("ASIA", asiaCountries);

        Set<String> africaCountries = new HashSet<>();
        africaCountries.add("EGYPT");
        africaCountries.add("MAROCO");
        africaCountries.add("RPA");

        continentCountries.put("AFRICA", africaCountries);

        Set<String> australiaCountries = new HashSet<>();
        australiaCountries.add("AUSTRALIA");
        australiaCountries.add("NEW ZELAND");

        continentCountries.put("AUSTRALIA", australiaCountries);
    }
}
