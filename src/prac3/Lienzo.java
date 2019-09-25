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
    private Color colorFondo;
    private Color colorPincel;
    private float grosor;
    ArrayList<Point2D> myPoints = new ArrayList<>();
    public Lienzo(){
        colorFondo = Color.WHITE;
        colorPincel = Color.BLACK;
    }
    
    @Override 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        this.setBackground(colorFondo);
        this.setForeground(colorPincel);
        
        int px[] = new int [myPoints.size()];
        int py[] = new int [myPoints.size()];
        
        for (int i=0; i< myPoints.size();i++){
            px[i] = (int)myPoints.get(i).getX();
            py[i] = (int)myPoints.get(i).getY();
            g2d.fillOval(px[i],py[i],(int)grosor,(int)grosor);
        }
        //g2d.drawOval(px,py,grosor,grosor);
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
    
    public void setColorFondo(Color color){
        colorFondo = color;
    }
    public void setColorPincel(Color color){
        colorPincel = color;
    }
    public void setGrosor(float nGrosor){
        grosor = nGrosor;
        
    }
    public void blank(){
        myPoints.removeAll(myPoints);
        repaint();
    }
}
