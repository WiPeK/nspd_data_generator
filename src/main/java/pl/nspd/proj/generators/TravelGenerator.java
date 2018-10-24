package pl.nspd.proj.generators;

import pl.nspd.proj.models.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static pl.nspd.common.util.GeneratorUtil.id;
import static pl.nspd.proj.generators.Generator.*;

public class TravelGenerator {
    public static Set<Travel> generate(
            Set<TravelDestination> travelDestinations,
            Set<TravelType> travelTypes,
            Set<StartingPlace> startingPlaces,
            Set<Day> days,
            Set<Month> months,
            Set<Year> years
    ) {
        Set<Travel> travels = new HashSet<>();

        for (int i = 0; i < 2000; i++) {
            for (int i1 = 0; i1 < 10; i1++) {
                String destination = destination(travelDestinations);
                String startingPlace = startingPlace(startingPlaces);
                String travelType = travelType(travelTypes);
                int numberOfPersons = numberOfPersons();

                Day startDay = dayObj(days);
                Month startMonth = months.stream().filter(month -> month.id.equals(startDay.monthId)).findFirst().get();
                Year startYear = years.stream().filter(year -> year.id.equals(startMonth.yearId)).findFirst().get();

                LocalDate startDate = LocalDate.of(startYear.year, startMonth.month, startDay.day);
                LocalDate endDate = startDate.plusDays(durationDays());

                travels.add(new Travel(
                        id(),
                        numberOfPersons,
                        price(numberOfPersons),
                        startDate,
                        endDate,
                        destination,
                        startingPlace,
                        travelType));
            }
        }

        return travels;
    }
}
