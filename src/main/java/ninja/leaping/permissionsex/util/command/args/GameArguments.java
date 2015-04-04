/**
 * PermissionsEx
 * Copyright (C) zml and PermissionsEx contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ninja.leaping.permissionsex.util.command.args;

import ninja.leaping.permissionsex.util.command.CommandContext;
import ninja.leaping.permissionsex.util.command.Commander;

import java.util.List;

/**
 * Contains command elements for parts of the game
 */
public class GameArguments {
    private GameArguments() {

    }

    /**
     * Expect the provided argument to specify a subject
     * TODO: How do we pass global state? As a Game/PermissionsEx/whatever argument from the caller? that's a bt ugly...
     * @param type The subject type? Is this necessary?
     * @param key The key to store the parsed argument under
     * @return the element to match the input
     */
    public static CommandElement subject(String type, String key) {
        return null;
    }

    private static class SubjectElement extends CommandElement {

        protected SubjectElement(String key) {
            super(key);
        }

        @Override
        protected Object parseValue(CommandArgs args) throws ArgumentParseException {
            return null;
        }

        @Override
        public <TextType> List<String> tabComplete(Commander<TextType> src, CommandArgs args, CommandContext context) {
            return null;
        }
    }

}