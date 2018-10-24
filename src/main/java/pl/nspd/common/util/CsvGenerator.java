package pl.nspd.common.util;

import pl.nspd.common.model.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
        File dir = new File("CSV files");
        dir.mkdir();
        return dir;
    }
}
