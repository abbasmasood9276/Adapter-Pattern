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
public class FlacPlayer implements AdvancedMediaPlayer {
    @Override
    public void playFlac(String fileName) {
        System.out.println("Playing flac file. Name: " + fileName);
    }
}
