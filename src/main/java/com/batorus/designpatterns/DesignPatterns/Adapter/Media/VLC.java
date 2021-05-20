package com.batorus.designpatterns.DesignPatterns.Adapter.Media;

public class VLC implements IVideoPlayer {

    @Override
    public void playVideo(String filename) {
        System.out.println("Playing VLC File " + filename);
    }
}
