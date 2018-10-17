package asia.devs.from.discordjar.entities;

import asia.devs.from.discordjar.entities.channel.Channel;
import asia.devs.from.discordjar.entities.channel.VoiceChannel;

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;

public interface Guild extends Snowflake {

    String getName();

    String getIconHash();

    String getIconUrl();

    String getSplashHash();

    String getSplashUrl();

    Member getOwner();

    default long getOwnerId() {
        return getOwner().getId();
    }

    Region getRegion();

    VoiceChannel getAfkChannel();

    default long getAfkChannelId() {
        return getAfkChannel().getId();
    }

    int getAfkTimeout();

    boolean hasEmbedEnabled();

    long getEmbedId();

    Channel getSystemChannel();

    VerificationLevel getVerificationLevel();

    MessageNotificationLevel getDefaultMessageNotificationLevel();

    ExplicitContentFilterLevel getExplicitContentFilterLevel();

    List<Role> getRoles();

    List<Emote> getEmotes();

    String[] getFeatures();

    MFALevel getMFALevel();

    default boolean isMFALevel(MFALevel level) {
        return level.equals(getMFALevel());
    }

    boolean isCreatedByBot();

    long getApplicationId();

    boolean hasWidgetEnabled();

    Channel getWidgetChannel();

    String getJoinDateRaw();

    default OffsetDateTime getJoinDate() {
        //TODO: Implement guild join date
        return null;
    }

    default Date getJoinDateAsDate() {
        return new Date(getJoinDate().toInstant().toEpochMilli());
    }

    boolean isLarge();

    boolean isUnavailable();

    int getMemberCount();

    List<VoiceState> getVoiceStates();

    List<Member> getMembers();

    List<Channel> getChannels();

    List<Presence> getPresences();

    interface Region extends Snowflake {

        boolean isVip();

        String getName();

        boolean isOptimal();

        boolean isDeprecated();

        boolean isCustom();

    }

    enum VerificationLevel {

        NONE(0, "unrestricted"),
        LOW(1, "must have verified email on account"),
        MEDIUM(2, "must be registered on Discord for longer than 5 minutes"),
        HIGH(3, "must be a member of the server for longer than 10 minutes"),
        VERY_HIGH(4, " must have a verified phone number");

        private final int level;
        private final String description;

        VerificationLevel(int level, String description) {
            this.level = level;
            this.description = description;
        }

        public int getLevel() {
            return level;
        }

        public String getDescription() {
            return description;
        }
    }

    enum MessageNotificationLevel {

        ALL_MESSAGES(0),
        ONLY_MENTIONS(1);

        private final int value;

        MessageNotificationLevel(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    enum ExplicitContentFilterLevel {

        DISABLED(0),
        MEMBERS_WITHOUT_ROLES(1),
        ALL_MEMBERS(2);

        private final int value;

        ExplicitContentFilterLevel(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    enum MFALevel {
        NONE(0),
        ELEVATED(1);

        private final int value;

        MFALevel(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
