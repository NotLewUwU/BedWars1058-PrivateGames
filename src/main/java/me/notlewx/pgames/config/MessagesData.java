package me.notlewx.pgames.config;

import org.bukkit.configuration.file.YamlConfiguration;
import com.andrei1058.bedwars.api.language.Language;

public class MessagesData {
    public final static String PATH = "addons.private-games.";

    public MessagesData() {
        setupMessages();
    }

    public void setupMessages() {
        for (Language l : Language.getLanguages()) {
            YamlConfiguration yml = l.getYml();
            switch (l.getIso()) {
                default:
                    yml.addDefault(MAIN_MENU_NAME, "&7Private game settings");
                    yml.addDefault(NOT_IN_PARTY, "&cYou are not in a party!");
                    yml.addDefault(PRIVATE_GAME_ENABLED, "&aYou've enabled private games");
                    yml.addDefault(PRIVATE_GAME_ENABLED_OTHERS, "&a{player} has enabled private games");
                    yml.addDefault(PRIVATE_GAME_DISABLED, "&cYou've disabled private games disabled");
                    yml.addDefault(PRIVATE_GAME_DISABLED_OTHERS, "&c{player} has disabled private games");
                    break;
                case "es":
                    yml.addDefault(MAIN_MENU_NAME, "&7Ajustes de partida privada");
                    yml.addDefault(NOT_IN_PARTY, "&cNo estas en una party!");
                    yml.addDefault(PRIVATE_GAME_ENABLED, "&aPartida privada habilitada");
                    yml.addDefault(PRIVATE_GAME_ENABLED_OTHERS, "&a{player} ha habilitado la partida privada habilitada");
                    yml.addDefault(PRIVATE_GAME_DISABLED, "&cPartida privada deshabilitada");
                    yml.addDefault(PRIVATE_GAME_DISABLED_OTHERS, "&c{player} ha deshabilitado la partida privada");
                    break;
            }
            l.getYml().options().copyDefaults(true);
            l.save();
        }
    }
    public static final String
            MAIN_MENU_NAME = PATH + "menu.menu-name",
            NOT_IN_PARTY = PATH + "not-in-party",
            PRIVATE_GAME_ENABLED = PATH + "game.enabled",
            PRIVATE_GAME_ENABLED_OTHERS = PATH + "game.enabled-others",
            PRIVATE_GAME_DISABLED = PATH + "game.disabled",
            PRIVATE_GAME_DISABLED_OTHERS = PATH + "game.disabled-others";
}
