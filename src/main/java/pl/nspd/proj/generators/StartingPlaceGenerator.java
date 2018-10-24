package pl.nspd.proj.generators;

import pl.nspd.proj.models.BranchAddress;
import pl.nspd.proj.models.StartingPlace;

import java.util.Set;
import java.util.stream.Collectors;

import static pl.nspd.common.util.GeneratorUtil.id;

public class StartingPlaceGenerator {
    public static Set<StartingPlace> generate(Set<BranchAddress> branchAddresses) {
        return branchAddresses.stream()
                .map(branchAddress -> new StartingPlace(id(), branchAddress.city, branchAddress.street))
                .collect(Collectors.toSet());
    }
}
