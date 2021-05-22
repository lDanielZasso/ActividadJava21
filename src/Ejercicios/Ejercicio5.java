
package Ejercicios;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Ejercicio5 extends Applet {

    public void init() {
        resize(400, 400);
    }
    
    public void paint(Graphics g){
        int puntosx[] = new int[3], puntosy[] = new int[3];
        
        g.setColor(Color.red);
        g.fillRect(100, 100, 200, 160);
        
        /*Triángulo superior
        punto 1 = (100, 100)
        punto 2 = (200, 180)
        punto 3 = (300, 100)*/
        
        puntosx[0] = 100;
        puntosy[0] = 100;
        
        puntosx[1] = 200;
        puntosy[1] = 180;
        
        puntosx[2] = 300;
        puntosy[2] = 100;
      
        g.setColor(Color.BLUE);
        g.fillPolygon(puntosx, puntosy, 3);
        
        /* Triángulo izquierdo
        punto 1 = (100,100)
        punto 2 = (200, 180)
        punto 3 = (100, 200)
        */
        
        puntosx[0] = 100;
        puntosy[0] = 100;
        
        puntosx[1] = 200;
        puntosy[1] = 180;
        
        puntosx[2] = 100;
        puntosy[2] = 260;
        
        g.setColor(Color.ORANGE);
        g.fillPolygon(puntosx, puntosy, 3);
        
        /* Triángulo derecho
        punto 1 = (300,100)
        punto 2 = (200, 180)
        punto 3 = (300, 180)
        */
        
        puntosx[0] = 300;
        puntosy[0] = 100;
        
        puntosx[1] = 200;
        puntosy[1] = 180;
        
        puntosx[2] = 300;
        puntosy[2] = 180;
        
        g.setColor(Color.YELLOW);
        g.fillPolygon(puntosx, puntosy, 3);
    }

}
