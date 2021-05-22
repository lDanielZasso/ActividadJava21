
package Ejercicios;

import java.applet.Applet;
import java.awt.Graphics;

public class Ejercicio2 extends Applet {

    @Override
    public void init() {
        resize(800, 800);
    }
    
    @Override
    public void paint(Graphics g){
        int cx = 195, cy = 195, r = 100, x, y;
        
        for(double ang=Math.PI; ang>0; ang-=0.01){
            dibujaFigura(g);
            x = (int)(r*Math.cos(ang))+cx;
            y = (int)(r*Math.sin(ang))+cy;
            g.drawOval(x, y, 10, 10);
            pausa(5);
            g.clearRect(x, y, 11, 11);
        }
        
        cx=395;
        cy=195;
        for(double ang=Math.PI; ang<2*Math.PI; ang+=0.01){
            dibujaFigura(g);
            x = (int)(r*Math.cos(ang))+cx;
            y = (int)(r*Math.sin(ang))+cy;
            g.drawOval(x, y, 10, 10);
            pausa(5);
            g.clearRect(x, y, 11, 11);
        }
    }
    
    public void dibujaFigura(Graphics g){
        int cx = 200, cy = 200, r = 100, x, y;
        
        for(double ang=Math.PI; ang>0; ang-=0.01){
            x = (int)(r*Math.cos(ang))+cx;
            y = (int)(r*Math.sin(ang))+cy;
            g.fillOval(x, y, 2, 2);

        }
        
        cx=399;
        cy=200;
        for(double ang=Math.PI; ang<2*Math.PI; ang+=0.01){
            x = (int)(r*Math.cos(ang))+cx;
            y = (int)(r*Math.sin(ang))+cy;
            g.fillOval(x, y, 2, 2);
        }
        
    }
    
    public void pausa(int n){
        try{
            Thread.sleep(n);
        }catch(Exception e){
            
        }
    }

}
