package org.webapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] arg) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString()) ;

        //ClassicalMusic classicalMusic = context.getBean("someClassicalMusic", ClassicalMusic.class);
        //RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        //System.out.println(classicalMusic.getSong());
        //System.out.println(rockMusic.getSong());
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        //MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //System.out.println(firstMusicPlayer==secondMusicPlayer);

        //secondMusicPlayer.setVolume(125);
        //System.out.println(firstMusicPlayer.getVolume());
        //System.out.println(secondMusicPlayer.getVolume());
        context.close();
    }
}
