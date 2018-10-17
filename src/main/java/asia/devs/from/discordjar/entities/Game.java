package asia.devs.from.discordjar.entities;

public class Game {

    private final String name;
    private String url;
    private final GameType type;

    enum GameType {
        PLAYING(0),
        STREAMING(1),
        LISTENING(2);

        private final int value;

        GameType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Game(String name, GameType type) {
        this.name = name;
        this.type = type;
    }

    private Game(String name, String url, GameType type) {
        this(name, type);
        this.url = url;
    }

    public static Game parse(String name, GameType type) {
        return new Game(name, type);
    }

    public static Game parse(String name, GameType type, String url) {
        return new Game(name, url, type);
    }

    public static Game playing(String name) {
        return parse(name, GameType.PLAYING);
    }

    public static Game listening(String name) {
        return parse(name, GameType.LISTENING);
    }

    public static Game streaming(String name, String url) {
        return parse(name, GameType.STREAMING, url);
    }
}
