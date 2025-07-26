/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String args[]){
        JFrame f = new JFrame("Angry Birds Racing");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(0, 0, 1100, 600);
        f.add(new Road());
        f.setVisible(true);
        
        int i=0;
        while(i<=4){
        try{
            File soundFile = new File("src/res/song.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
            Clip clip  = AudioSystem.getClip();
            clip.open(ais);
            clip.setFramePosition(0);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
            clip.stop();
            clip.close();
        }catch(IOException | UnsupportedAudioFileException |
                LineUnavailableException exc){
            exc.printStackTrace();
        }catch(InterruptedException exc){
            
        }
        }
    }
}
