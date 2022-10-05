package org.webapp;

import org.springframework.stereotype.Component;

public class RapMusic implements Music {

    public RapMusic() {

    }

    public static RapMusic getClassicalMusic() {
        return new RapMusic();
    }

    public void init() {
        System.out.println("Initialization");
    }

    public void destroy() {
        System.out.println("Destruction");
    }

    @Override
    public String getSong() {
        return "I'm Slim Shady";
    }
}
