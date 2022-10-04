package org.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("someClassicalMusic")
    private Music music1;

    @Autowired
    @Qualifier("rockMusic")
    private Music music2;

    public String playMusic() {
        return "Playing " + music1.getSong() + " " + music2.getSong();
    }
}
