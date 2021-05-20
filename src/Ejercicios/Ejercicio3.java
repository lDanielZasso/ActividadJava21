
package Ejercicios;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Ejercicio3 extends Applet {

    public void init() {
        resize(400,400);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(50, 50, 60, 60);
        
        g.setColor(Color.BLUE);
        g.fillRect(110, 110, 120, 120);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(230, 50, 60, 60);
        
        g.setColor(Color.GREEN);
        g.fillRect(50, 230, 60, 60);
        
        g.setColor(Color.ORANGE);
        g.fillRect(230, 230, 60, 60);
                
    }

}