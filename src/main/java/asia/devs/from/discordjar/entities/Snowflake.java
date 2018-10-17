package asia.devs.from.discordjar.entities;

public interface Snowflake {

    long getId();
    default String getIdAsString() {
        return String.valueOf(getId());
    }

}
