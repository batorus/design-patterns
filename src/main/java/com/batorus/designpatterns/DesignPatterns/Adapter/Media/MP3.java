package com.batorus.designpatterns.DesignPatterns.Adapter.Media;

public class MP3 implements IAudioPlayer {

    @Override
    public void playAudio(String filename) {
        System.out.println("Playing MP3 File " + filename);
    }
}
