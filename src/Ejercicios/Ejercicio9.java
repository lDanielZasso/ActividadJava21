
package Ejercicios;

import java.applet.Applet;
import java.awt.Graphics;

public class Ejercicio9 extends Applet {

    public void init() {
        resize(400, 400);
    }
    
    public void paint(Graphics g){
        int puntosx [] = new int[3], puntosy [] = new int[3];
        
        /* Puntos triangulo con punta hacia abajo 
            Punto 1 = (100, 100)
            Punto 2 = (300, 100)
            Punto 3 = (200, 300)
        */
        
        puntosx[0] = 100;
        puntosy[0] = 100;
        
        puntosx[1] = 300;
        puntosy[1] = 100;
        
        puntosx[2] = 200;
        puntosy[2] = (int) (100*Math.sqrt(3)+100);
        
        g.drawPolygon(puntosx, puntosy, 3);
        
        /* Puntos triangulo con punta hacia arriba
            Punto 1 = (100, 200)
            Punto 2 = (200, 0)
            Punto 3 = (300, 200)
        */
        
        puntosx[0] = 100;
        puntosy[0] = 200;
        
        puntosx[1] = 300;
        puntosy[1] = 200;
        
        puntosx[2] = 200;
        puntosy[2] = (int) (-100*Math.sqrt(3)+200);
        
        g.drawPolygon(puntosx, puntosy, 3);
    }

}

