package asia.devs.from.discordjar.entities.channel;

import asia.devs.from.discordjar.entities.Message;

public interface MessageChannel {

    Message getLastMessage();

    default boolean hasLatestMessage() {
        return getLastMessage() != null;
    }
}
