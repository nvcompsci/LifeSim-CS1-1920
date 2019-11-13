/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifesim;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author jword
 */
public class LifeSim extends JPanel {
    Gremlin[] population = new Gremlin[400];
    Gremlin[][] spaces = new Gremlin[20][20];
    Timer timer = new Timer();
    
    //Constructor for World, LifeSim
    public LifeSim() {
        timer.scheduleAtFixedRate(new Task(), 100, 1000/6);
        //Use for loop to make 400
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                Gremlin newGremlin = new Gremlin();
                population[i * 20 + j] = newGremlin;
                spaces[i][j] = newGremlin;
            }
        }
        
    }
    
    private class Task extends TimerTask {
        @Override
        public void run() {
            repaint();
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.DARK_GRAY);
        //Use for loop to draw all spaces
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (spaces[i][j] == null) continue;
                spaces[i][j].update(spaces);
                spaces[i][j].draw(g, j*40, i*40);
            }
        }
        
        
    }    
    
   public static void main(String[] args) {
        JFrame f = new JFrame("Matrix Notes");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LifeSim gc = new LifeSim();
        f.add(gc);
        f.pack();
        f.setSize(800,800);
        f.setPreferredSize(new Dimension(800, 800));
        f.setVisible(true);        
    }
    
}
