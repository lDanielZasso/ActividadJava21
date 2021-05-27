
package Ejercicios;

import java.applet.Applet;
import java.awt.Graphics;

public class Ejercicio10 extends Applet {

    @Override
    public void init() {
        resize(600, 600);
    }
    
    @Override
    public void paint(Graphics g){
        int y = 190, x;
        g.drawRect(200, 200, 200, 150);
        
        for(x=200; x<=395; x++){
            g.fillRect(x, y, 10, 10);
            pausa(10);
            g.clearRect(x, y, 10, 10);
        }
        
        for(y=190; y<=345; y++){
            g.fillRect(x, y, 10, 10);
            pausa(10);
            g.clearRect(x, y, 10, 10);
            g.drawRect(200, 200, 200, 150);
        }
    
    }
    
    public void pausa(int n){
            try{
                Thread.sleep(n);
            }catch(InterruptedException e){
                
            }
        }

}
