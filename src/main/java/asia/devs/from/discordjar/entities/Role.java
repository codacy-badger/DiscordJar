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

import java.awt.*;

public interface Role extends Snowflake {

    String getName();

    int getColorHex();

    //TODO Does this really work?
    default Color getColor() {
        return Color.decode(String.valueOf(getColorHex()));
    }

    boolean isHoist();

    int getPosition();

    int getPermissionsAsBitset();

    boolean isManaged();

    boolean isMentionable();
}
