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

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.DARK_GRAY);
        Gremlin grem1 = new Gremlin();
        grem1.draw(g, 100, 100);
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
