package asia.devs.from.discordjar.entities.channel;

import asia.devs.from.discordjar.entities.Shard;
import asia.devs.from.discordjar.entities.Snowflake;

public interface Channel extends Snowflake {

    Shard getShard();

    Type getType();

    enum Type {
        GUILD_TEXT(0),
        DM(1),
        GUILD_VOICE(2),
        GROUP_DM(3),
        GUILD_CATEGORY(4);

        private final int value;

        Type(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
