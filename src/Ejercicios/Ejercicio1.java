package Ejercicios;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Ejercicio1 extends Applet {
    
    public void init() {
        resize(300,300);
    }
    
    public void paint(Graphics g){
        for(int i=0; i<2000; i++){
            int x = (int)(Math.random()*300);
            int y = (int)(Math.random()*300);
            int R = (int)(Math.random()*256);
            int G = (int)(Math.random()*256);
            int B = (int)(Math.random()*256);
            
            g.setColor(new Color(R,G,B));
            g.fillOval(x, y, 5, 5);
            
        }
    }

}
