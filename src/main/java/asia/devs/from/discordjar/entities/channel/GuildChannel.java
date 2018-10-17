package asia.devs.from.discordjar.entities.channel;

import asia.devs.from.discordjar.entities.Guild;

import java.util.List;

public interface GuildChannel extends Channel {

    Guild getGuild();

    default long getGuildId() {
        return getGuild().getId();
    }

    int getPosition();

    List<PermissionOverwrite> getPermissionOverwrites();

    String getName();

    Category getParent();

    default boolean hasParent() {
        return getParent() != null;
    }

    boolean isNSFW();
}
