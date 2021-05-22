
package Ejercicios;

import java.applet.Applet;
import java.awt.Graphics;

public class Ejercicio2 extends Applet {

    public void init() {
        resize(800, 800);
    }
    
    @Override
    public void paint(Graphics g){
        int cx = 200, cy = 200, r = 100, x, y, indicador=1, alto, ancho, centrox, centroy;
        
        for(double ang=Math.PI; ang>0; ang-=0.01){
            //g.clearRect(0, 0, 500, 500);
            x = (int)(r*Math.cos(ang))+cx;
            y = (int)(r*Math.sin(ang))+cy;
            g.drawOval(x, y, 10, 10);
            alto = g.getClipBounds().height;
            ancho = g.getClipBounds().width;
            centrox = g.getClipBounds().x + (ancho/2);
            centroy = g.getClipBounds().y + (alto/2);
            borrarContorno(centrox,centroy,g);
            pausa(5);
            //g.clearRect(x, y, 12, 12);
            g.fillOval(x+5, y+5, 2, 2);
            pausa(10);
           
        }
        
        cx=399;
        cy=200;
        for(double ang=Math.PI; ang<2*Math.PI; ang+=0.01){
            x = (int)(r*Math.cos(ang))+cx;
            y = (int)(r*Math.sin(ang))+cy;
            g.fillOval(x, y, 10, 10);
            pausa(10);
        }
    }
    
    public void borrarContorno(int cx, int cy, Graphics g){
        
        for(double ang=0; ang<2*Math.PI; ang+=0.01){
            int x = (int)(5*Math.cos(ang))+cx;
            int y = (int)(5*Math.sin(ang))+cy;
            
            g.clearRect(x, y, 2, 2);
        }
        
    }
    
    public void pausa(int n){
        try{
            Thread.sleep(n);
        }catch(Exception e){
            
        }
    }

}
