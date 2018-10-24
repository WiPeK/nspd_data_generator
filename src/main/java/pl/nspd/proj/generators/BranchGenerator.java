package pl.nspd.proj.generators;

import pl.nspd.proj.models.Branch;
import pl.nspd.proj.models.BranchAddress;

import java.util.HashSet;
import java.util.Set;

import static pl.nspd.common.util.GeneratorUtil.id;
import static pl.nspd.proj.data.BranchNameData.branchNames;

public class BranchGenerator {
    public static Set<Branch> generate(Set<BranchAddress> branchesAddresses) {
        Set<Branch> branches = new HashSet<>();
        int branchNumber = 0;
        for (BranchAddress branchesAddress : branchesAddresses) {
            branches.add(new Branch(id(), branchNames[branchNumber++], branchesAddress.id));
        }
        return branches;
    }
}
