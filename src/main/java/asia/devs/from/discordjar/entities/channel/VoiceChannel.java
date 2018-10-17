package asia.devs.from.discordjar.entities.channel;

public interface VoiceChannel extends GuildChannel {

    int getBitrate();

    int getUserLimit();
}
