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
public interface AdvancedMediaPlayer {
    void play(String fileName);
}

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
