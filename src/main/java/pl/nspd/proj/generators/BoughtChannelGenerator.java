package pl.nspd.proj.generators;

import pl.nspd.proj.models.BoughtChannel;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static pl.nspd.proj.data.BoughtChannelData.boughtChannels;
import static pl.nspd.common.util.GeneratorUtil.id;

public class BoughtChannelGenerator {
    public static Set<BoughtChannel> generate() {
        return Arrays.stream(boughtChannels)
                .map(boughtChannel -> new BoughtChannel(id(), boughtChannel))
                .collect(Collectors.toSet());
    }
}
