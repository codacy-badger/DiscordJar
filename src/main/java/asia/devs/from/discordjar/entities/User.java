package asia.devs.from.discordjar.entities;

public interface User extends Snowflake {

    String getUsername();
    String getDiscriminator();
    String getAvatarHash();
    String getAvatarUrl();
    boolean isBot();

    default int getDiscriminatorAsInt() {
        return Integer.parseInt(getDiscriminator());
    }
}
