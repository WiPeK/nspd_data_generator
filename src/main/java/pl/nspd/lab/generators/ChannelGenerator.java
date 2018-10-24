package pl.nspd.lab.generators;

import pl.nspd.lab.models.Channel;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static pl.nspd.lab.data.ChannelData.channels;
import static pl.nspd.common.util.GeneratorUtil.id;

public class ChannelGenerator {
    public static Set<Channel> generate() {
        return Arrays.stream(channels)
                .map(channel -> new Channel(id(), channel))
                .collect(Collectors.toSet());
    }
}
