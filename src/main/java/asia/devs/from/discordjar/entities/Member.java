package asia.devs.from.discordjar.entities;

import java.util.List;

public interface Member extends User {

    Guild getGuild();
    String getNickname();
    List<Role> getRoles();
    String getJoinDateRaw();
    boolean isDeafn();
    boolean isMuted();
}
