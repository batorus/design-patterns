package com.batorus.designpatterns.DesignPatterns.Adapter.Media;

public class AudioToVideoAdapter implements IVideoPlayer{

    IAudioPlayer audioFile;

    public AudioToVideoAdapter(IAudioPlayer audioFile) {
        this.audioFile = audioFile;
    }

    @Override
    public void playVideo(String filename) {
        System.out.println("<--Play using Audio to Video Adapter-->");
        audioFile.playAudio(filename);
    }
}
