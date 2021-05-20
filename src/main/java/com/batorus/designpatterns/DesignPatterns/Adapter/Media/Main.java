package com.batorus.designpatterns.DesignPatterns.Adapter.Media;

public class Main {

    public static void main(String[] args) {
        //Video--->Audio
//        IAudioPlayer player = new MP3();
//        player.playAudio("file.mp3");
//
//        player = new VideoToAudioAdapter(new MP4());
//        player.playAudio("file.mp4");
//
//        player = new VideoToAudioAdapter(new VLC());
//        player.playAudio("file.avi");

        IVideoPlayer videoPlayer = new MP4();
        videoPlayer.playVideo("file.avi");

        videoPlayer = new AudioToVideoAdapter(new MP3());
        videoPlayer.playVideo("file.mp3");


    }
}
