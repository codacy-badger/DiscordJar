package asia.devs.from.discordjar.entities.channel;

import asia.devs.from.discordjar.entities.Snowflake;

public interface PermissionOverwrite {

    Snowflake getId();

    Type getType();

    default boolean isType(Type type) {
        return type.equals(getType());
    }

    default boolean isMemberType() {
        return isType(Type.MEMBER);
    }

    default boolean isRoleType() {
        return isType(Type.ROLE);
    }

    int getAllow();

    int getDeny();

    enum Type {
        ROLE("role"),
        MEMBER("member");

        private final String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
