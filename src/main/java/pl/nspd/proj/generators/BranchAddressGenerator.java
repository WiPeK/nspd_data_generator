package pl.nspd.proj.generators;

import pl.nspd.proj.models.BranchAddress;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static pl.nspd.common.util.GeneratorUtil.id;
import static pl.nspd.proj.data.BranchAddressData.branchesCities;
import static pl.nspd.proj.generators.Generator.branchCountry;
import static pl.nspd.proj.generators.Generator.street;

public class BranchAddressGenerator {
    public static Set<BranchAddress> generate() {
        return Arrays.stream(branchesCities)
                .map(city -> new BranchAddress(id(), branchCountry(), city, street()))
                .collect(Collectors.toSet());
    }
}
