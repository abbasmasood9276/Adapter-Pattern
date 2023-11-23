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
public class AviPlayer implements AdvancedMediaPlayer {
    public void playAvi(String fileName) {
        System.out.println("Playing avi file. Name: " + fileName);
    }

    @Override
    public void play(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
