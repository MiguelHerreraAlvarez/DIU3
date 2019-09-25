package prac3;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Lienzo extends JPanel{
    private Color colorFondo;
    private Color colorPincel;
    private float grosor;
    
    ArrayList<Point2D> myPoints = new ArrayList<Point2D>();
    
    @Override 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        this.setBackground(colorFondo);
        this.setForeground(colorPincel);
        
        int px[] = new int [myPoints.size()];
        int py[] = new int [myPoints.size()];
        
        for (int i=0; i< myPoints.size();i++){
            //g.drawOval(i,i,WIDTH,HEIGHT)
            px[i] = (int)myPoints.get(i).getX();
            py[i] = (int)myPoints.get(i).getY();
        }
        //g2d.drawLine(px,py,myPoints.size());
    }
    
    public void pinta(Point punto, int valor){
        myPoints.add(punto);
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
    
}
