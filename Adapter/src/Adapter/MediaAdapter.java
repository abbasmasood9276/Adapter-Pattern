/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author FA20-BSE-001
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("flac")) {
            advancedMusicPlayer = new FlacPlayer();
        } else if (audioType.equalsIgnoreCase("avi")) {
            advancedMusicPlayer = new AviPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (advancedMusicPlayer != null) {
            advancedMusicPlayer.play(fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}

