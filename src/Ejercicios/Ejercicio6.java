
package Ejercicios;

import java.applet.Applet;
import java.awt.Graphics;

public class Ejercicio6 extends Applet {

    public void init() {
        resize(400,400);
    }
    
    public void paint(Graphics g){
        int semaforo = 0, x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        double ang1=0, ang2=0;
        
        g.fillOval(200, 200, 40, 40);
        
        while(true){
            if(semaforo == 0){
                x1 = (int) (50*Math.cos(ang1)) + 215;
                y1 = (int) (50*Math.sin(ang1)) + 215;
                
                g.drawOval(x1, y1, 10, 10);
                g.drawOval(x2, y2, 10, 10);
                
                pausa(5);
                
                g.clearRect(x1, y1, 11, 11);
                g.clearRect(x2, y2, 11, 11);
                
                if(ang1==2*Math.PI)
                    ang1 = 0;
                else
                    ang1 += 0.01;
                
                semaforo = 1;
            }else{
                x2 = (int) (80*Math.cos(ang2)) + 215;
                y2 = (int) (80*Math.sin(ang2)) + 215;
                g.drawOval(x2, y2, 10, 10);
                g.drawOval(x1, y1, 10, 10);
                
                pausa(5);
                
                g.clearRect(x1, y1, 11, 11);
                g.clearRect(x2, y2, 11, 11);
                
                if(ang2==2*Math.PI)
                    ang2 = 0;
                else
                    ang2 -= 0.01;
                
                semaforo = 0;
            }
        }
    }
        
    public void pausa(int n){
        try{
            Thread.sleep(n);
        }catch(Exception e){

        }
    }
}

