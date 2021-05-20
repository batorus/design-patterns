package com.batorus.designpatterns.DesignPatterns.Adapter.Media;

public class MP4 implements IVideoPlayer {

    @Override
    public void playVideo(String filename) {
        System.out.println("Playing MP4 File " + filename);
    }

}