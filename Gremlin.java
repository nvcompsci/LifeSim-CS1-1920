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
    
    public void update(Gremlin[][] world, int x, int y) {
        //make Gremlin get older
        this.age++;
        if (age > 85) {
            this.size = 0;
        }
        //get smaller over time
        //this.size -= 0.05;
        lookAround(world, x, y);
    }
    
    private void lookAround(Gremlin[][] world, int x, int y) {
        for (int a = -1; a <= 1; a++) {            
            for (int b = -1; b <=1; b++) {
                if (x + b < 0 || x + b >= 20 || y + a < 0 || y + a >= 20) continue;
                //if (y + a < 0) continue;
                if (world[y+a][x+b] != null) {
                    if (this.species.equals(world[y+a][x+b].species)) {
                        System.out.println("same species");                        
                    }
                    else {
                        System.out.println("different species");
                        this.attack();
                    }
                }
                else {
                    System.out.println("empty");
                    this.reproduce();
                }
            }
        }
    }
    
    private void move() {
        
    }
    
    private void reproduce() {
        
    }
    
    private void attack() {
        
    }
    
    public void draw(Graphics g, int x, int y) {
        if (this.species.equals("gerb")) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.GREEN);
        }
        g.fillOval(x, y, this.size, this.size);
    }
}
