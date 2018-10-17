package asia.devs.from.discordjar.entities;

public interface VoiceState {

    long getGuildId();

    long getChannelId();

    long getUserId();

    String getSessionId();

    boolean isDeafn();

    boolean isMuted();

    boolean isSelfDeafn();

    boolean isSelfMuted();

    boolean isSuppressed();
}
