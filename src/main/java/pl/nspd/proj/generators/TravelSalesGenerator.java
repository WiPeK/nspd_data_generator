package pl.nspd.proj.generators;

import pl.nspd.common.util.DecimalUtil;
import pl.nspd.proj.models.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static pl.nspd.common.util.GeneratorUtil.*;
import static pl.nspd.proj.generators.Generator.*;

public class TravelSalesGenerator {
    @SuppressWarnings("unchecked")
    public static Set<TravelSale> generate(
        Set<Employee> employees,
        Set<Customer> customers,
        Set<Day> days,
        Set<Month> months,
        Set<Year> years,
        Set<Travel> travels,
        Set<BoughtChannel> boughtChannels,
        Set<PaymentMethod> paymentMethods,
        Set<Branch> branches
    ) {
        Set<TravelSale> travelSales = new HashSet<>();
        // persons to branches

        Map<Branch, Set<Employee>> brnEmployees = new HashMap<>();
        Set<Employee> tmpEmployees = new HashSet<>(employees);
        for (Branch branch : branches) {
            Employee empl1 = randomFromSet(tmpEmployees);
            Employee empl2 = randomFromSet(tmpEmployees);
            Set<Employee> brnEmpls = new HashSet<>();
            brnEmpls.add(empl1);
            brnEmpls.add(empl2);
            brnEmployees.put(branch, brnEmpls);
            tmpEmployees.remove(empl1);
            tmpEmployees.remove(empl2);
        }

        for (int i = 0; i < travels.size() - 433; i++) {

            String travelId = travel(travels);
            Travel travel = travels.stream().filter(trav -> trav.id.equals(travelId)).findFirst().get();

            boolean isDayBeforeTravel = false;
            Day day = dayObj(days);
//            while(!isDayBeforeTravel) {
//                day = dayObj(days);
//                Day finalDay = day;
//                Month month = months.stream().filter(mnth -> mnth.id.equals(finalDay.monthId)).findFirst().get();
//                Year year = years.stream().filter(yr -> yr.id.equals(month.yearId)).findFirst().get();
//                if (LocalDate.of(year.year, month.month, day.day).isBefore(travel.startDate)) {
//                    isDayBeforeTravel = true;
//                }
//            }

            Object[] entries = brnEmployees.entrySet().toArray();
            Map.Entry<Branch, Set<Employee>> randBrn = (Map.Entry<Branch, Set<Employee>>)randomFromArray(entries);
            Branch branch = randBrn.getKey();

            travelSales.add(new TravelSale(
                    id(),
                    employee(randBrn.getValue()),
                    customer(customers),
                    day.id,
                    travelId,
                    boughtChannel(boughtChannels),
                    paymentMethod(paymentMethods),
                    DecimalUtil.round(travel.price * 1.23),
                    branch.id
            ));
        }

        return travelSales;
    }
}
