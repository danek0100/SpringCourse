package org.webapp;

import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music {

    public ClassicalMusic() {

    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("Initialization");
    }

    public void destroy() {
        System.out.println("Destruction");
    }

    @Override
    public String getSong() {
        return "Rhapsody";
    }
}
