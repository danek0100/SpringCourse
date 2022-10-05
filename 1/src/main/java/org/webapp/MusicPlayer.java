package org.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> musics;

    public MusicPlayer(List<Music> musics) {
        this.musics = musics;
    }

    public String playMusic() {
        Random random = new Random();
        return "Playing " + musics.get(random.nextInt(3)).getSong();
    }
}
