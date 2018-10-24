package pl.nspd.proj.generators;

import pl.nspd.common.util.DecimalUtil;
import pl.nspd.proj.models.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import static pl.nspd.common.util.GeneratorUtil.id;
import static pl.nspd.proj.generators.Generator.*;

public class TravelSalesGenerator {
    public static Set<TravelSale> generate(
        Set<Employee> employees,
        Set<Customer> customers,
        Set<Day> days,
        Set<Month> months,
        Set<Year> years,
        Set<Travel> travels,
        Set<BoughtChannel> boughtChannels,
        Set<PaymentMethod> paymentMethods
    ) {
        Set<TravelSale> travelSales = new HashSet<>();

        for (int i = 0; i < travels.size() - 433; i++) {

            String travelId = travel(travels);
            Travel travel = travels.stream().filter(trav -> trav.id.equals(travelId)).findFirst().get();

            boolean isDayBeforeTravel = false;
            Day day = dayObj(days);
            while(!isDayBeforeTravel) {
                day = dayObj(days);
                Day finalDay = day;
                Month month = months.stream().filter(mnth -> mnth.id.equals(finalDay.monthId)).findFirst().get();
                Year year = years.stream().filter(yr -> yr.id.equals(month.yearId)).findFirst().get();
                if (LocalDate.of(year.year, month.month, day.day).isBefore(travel.startDate)) {
                    isDayBeforeTravel = true;
                }
            }

            travelSales.add(new TravelSale(
                    id(),
                    employee(employees),
                    customer(customers),
                    day.id,
                    travelId,
                    boughtChannel(boughtChannels),
                    paymentMethod(paymentMethods),
                    DecimalUtil.round(travel.price * 1.23)
            ));
        }

        return travelSales;
    }
}
