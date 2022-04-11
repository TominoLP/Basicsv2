package de.tomino.basics.utils;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Config {

    public static final File CFG_FILE = new File("plugins/Basics/config.yml");
    public static final YamlConfiguration CFG = YamlConfiguration.loadConfiguration(CFG_FILE);
    public static String LANGUAGE;

    public static void load() {

        CFG.addDefault("version", "1.0");
        CFG.addDefault("prefix", "&8[&6Basics&8]");
        CFG.addDefault("language", "en");
        CFG.options().copyDefaults(true);
        LANGUAGE = CFG.getString("language").toLowerCase();
        Languages.setLanguage(LANGUAGE);

        try {
            CFG.save(CFG_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
