/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifesim;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author jword
 */
public class Gremlin {
    private int size;
    private int hp;
    private int strength;
    private String species;
    private int age;
    
    //Constructor
    public Gremlin() {
        this.size = (int) (Math.random() * 15);
        this.hp = 10;
        this.strength = (int) (Math.random() * 5);
        this.age = 0;
        if (Math.random() > 0.5) {
            this.species = "gerb";
        } else {
            this.species = "gorb";
        }
    }
    
    public void draw(Graphics g, int x, int y) {
        if (this.species.equals("gerb")) {
            g.setColor(Color.PINK);
        } else {
            g.setColor(Color.YELLOW);
        }
        g.fillOval(x, y, this.size, this.size);
    }
}
