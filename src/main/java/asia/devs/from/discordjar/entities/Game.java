/*
 *    Copyright 2018 Yannick Seeger & Michael Rittmeister & Oskar Lang & Leon Kappes
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

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
