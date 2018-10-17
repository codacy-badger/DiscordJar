package asia.devs.from.discordjar.entities;

import java.util.List;

public interface PresenceUpdate {

    User getUser();

    List<Role> getRoles();

    Game getGame();

    long getGuildId();

    OnlineStatus getStatus();
}
