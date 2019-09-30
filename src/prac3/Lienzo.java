/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Point2D;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Asus
 */
public class Lienzo extends JPanel{
    private float grosor;
    ArrayList<Point2D> myPoints = new ArrayList<>();
    
    public Lienzo(){
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
    }
    
    @Override 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        for (int i=0; i< myPoints.size();i++){
            g2d.fillOval((int)myPoints.get(i).getX(),
                    (int)myPoints.get(i).getY(),
                    (int)grosor,(int)grosor);
        }
    }
    
    public void pinta(Point punto, int valor) throws InterruptedException{
        myPoints.add(punto);
        if(valor < 50){
            sleep(valor + 15);
        }else{
            sleep(70 + valor/5);
        }
        
        if(myPoints.size() > 5) myPoints.remove(0);
        
    }
    
    public void setColorFondo(Color colorFondo){
        this.setBackground(colorFondo);
    }
    public void setColorPincel(Color colorPincel){
        this.setForeground(colorPincel);
    }
    public void setGrosor(float nGrosor){
        grosor = nGrosor;
    }
}
