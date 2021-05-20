package com.batorus.designpatterns.DesignPatterns.Adapter.Media;

public class VideoToAudioAdapter implements IAudioPlayer{
    private IVideoPlayer videoFile;

    public VideoToAudioAdapter(IVideoPlayer videoFile) {
        this.videoFile = videoFile;
    }

    @Override
    public void playAudio(String filename) {
        System.out.println("***** Using Video to Audio Adapter *****");
        videoFile.playVideo(filename);
    }
}
