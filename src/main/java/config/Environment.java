package config;

import io.github.cdimascio.dotenv.Dotenv;

public class Environment {

    private static Dotenv dotenv = Dotenv.load();

    public static String BASE_URL = dotenv.get("BASE_URL");
}
