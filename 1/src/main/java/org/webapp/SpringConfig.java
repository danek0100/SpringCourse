package org.webapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("org.webapp")
@PropertySource("classpath:configurations.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() { return  new RapMusic(); }

    @Bean
    List<Music> musicList() {
        List<Music> musicList = new ArrayList<Music>();
        musicList.add(classicalMusic());
        musicList.add(rockMusic());
        musicList.add(rapMusic());
        return musicList;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
