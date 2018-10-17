package asia.devs.from.discordjar.entities.channel;

public interface TextChannel extends GuildChannel, MessageChannel {

    String getTopic();

    int getRatelimitPerUser();

    default int getSlowmode() {
        return getRatelimitPerUser();
    }

    boolean hasSlowmode();

    default long getLastMessageId() {
        return getLastMessage().getId();
    }
}
