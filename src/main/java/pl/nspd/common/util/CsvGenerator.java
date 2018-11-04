package pl.nspd.common.util;

import pl.nspd.common.model.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import static com.sun.activation.registries.LogSupport.log;

public class CsvGenerator {

    public static void createCsv(Set<Model> models, String name) {
        File dir = makeBaseDir();
        try (PrintWriter out = new PrintWriter(dir + "/" + name + ".csv")) {
            models.forEach(model -> out.println(model.toCsv()));
        } catch (FileNotFoundException x) {
            log(x.toString());
        }
    }

    private static File makeBaseDir() {
        LocalDateTime now = LocalDateTime.now();
        String month = now.getMonth().getValue() < 10 ? ("0" + String.valueOf(now.getMonth().getValue())) : String.valueOf(now.getMonth().getValue());
        String day = now.getDayOfMonth() < 10 ? ("0" + String.valueOf(now.getDayOfMonth())) : String.valueOf(now.getDayOfMonth());
        String hour = now.getHour() < 10 ? ("0" + String.valueOf(now.getHour())) : String.valueOf(now.getHour());
        String minute = now.getMinute() < 10 ? ("0" + String.valueOf(now.getMinute())) : String.valueOf(now.getMinute());
        File dir = new File("CSV files/" + now.getYear() + month + day + hour + minute);
        dir.mkdir();
        return dir;
    }
}
