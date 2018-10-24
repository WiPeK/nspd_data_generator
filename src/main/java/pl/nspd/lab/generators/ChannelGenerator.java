package pl.nspd.lab.generators;

import pl.nspd.lab.models.Channel;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static pl.nspd.lab.data.ChannelData.channels;

public class ChannelGenerator {
    public static Set<Channel> generate() {
        return Arrays.stream(channels)
                .map(channel -> new Channel(Generator.id(), channel))
                .collect(Collectors.toSet());
    }
}
