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

/**
 *
 * @author jword
 */
public class LifeSim extends JPanel {
    Gremlin[] population = new Gremlin[30];
    Gremlin[][] spaces = new Gremlin[20][20];
    
    //Constructor for World, LifeSim
    public LifeSim() {
        //Use for loop to make 15
        
        Gremlin newGremlin = new Gremlin();
        population[0] = newGremlin;
        spaces[10][10] = newGremlin;
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.DARK_GRAY);
        //Use for loop to draw all spaces
        
        if (spaces[0][0] == null) continue;
        spaces[10][10].draw(g, 100, 100);
        
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
