
package Ejercicios;

import java.applet.Applet;
import java.awt.Graphics;

public class Ejercicio4 extends Applet {

    public void init() {
        resize(500,500);
    }
    
    public void paint(Graphics g){
        g.drawRect(100, 100, 200, 200);
        
        g.drawArc(100, 100, 400, 400, 90, 90);
        g.drawArc(-100, 100, 400, 400, 0, 90);
        g.drawArc(100,-100, 400, 400, 180, 90);
        g.drawArc(-100,-100, 400, 400, 270, 90);
    }

}
