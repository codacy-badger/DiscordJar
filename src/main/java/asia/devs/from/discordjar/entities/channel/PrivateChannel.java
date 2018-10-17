package asia.devs.from.discordjar.entities.channel;

import asia.devs.from.discordjar.entities.User;

import java.util.List;

public interface PrivateChannel extends Channel, MessageChannel {

    List<User> getRecipients();
}
