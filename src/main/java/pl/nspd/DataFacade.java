package pl.nspd;

import pl.nspd.generators.AuthorGenerator;
import pl.nspd.generators.QuartersGenerator;
import pl.nspd.models.Author;
import pl.nspd.models.Quarter;

import java.util.Set;

public class DataFacade {

    private Set<Quarter> quarters;
    private Set<Author> authors;

    public void generate() {
        generateData();
        generateCsv();
    }

    private void generateData() {
        quarters = QuartersGenerator.generate();
        authors = AuthorGenerator.generate();
    }

    private void generateCsv() {
        // todo jak się da to refleksją jechać po kolekcji i każdy objekt.getDeclaredField.value split ','
    }

}
