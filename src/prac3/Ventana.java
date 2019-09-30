/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac3;

import java.awt.Color;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class Ventana extends javax.swing.JFrame {
    Color[] colores = new Color[4];

    /**
     * Creates new form ventana
     */
    public Ventana() {
        initComponents();
        colores[0]= Color.BLACK;
        colores[1]= Color.WHITE;
        colores[2]= Color.RED;
        colores[3]= Color.BLUE;
        barraGrosor.setMinimum(2);
        barraGrosor.setMaximum(70);
        barraGrosor.setValue(10);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo1 = new prac3.Lienzo();
        comboPincel = new javax.swing.JComboBox<>();
        comboFondo = new javax.swing.JComboBox<>();
        barraGrosor = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lienzo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lienzo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lienzo1MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        comboPincel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Blanco", "Rojo", "Azul" }));
        comboPincel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPincelItemStateChanged(evt);
            }
        });

        comboFondo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Blanco", "Rojo", "Azul" }));
        comboFondo.setSelectedIndex(1);
        comboFondo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFondoItemStateChanged(evt);
            }
        });

        barraGrosor.setMinimum(1);
        barraGrosor.setValue(1);
        barraGrosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraGrosorStateChanged(evt);
            }
        });

        jLabel1.setText("Color Fondo");

        jLabel2.setText("Color Pincel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(comboPincel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(barraGrosor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboPincel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(barraGrosor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraGrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraGrosorStateChanged
        // TODO add your handling code here:
        lienzo1.setGrosor(barraGrosor.getValue());
        lienzo1.repaint();
    }//GEN-LAST:event_barraGrosorStateChanged

    private void comboPincelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPincelItemStateChanged
        // TODO add your handling code here:
        lienzo1.setColorPincel(colores[comboPincel.getSelectedIndex()]);
        lienzo1.repaint();
    }//GEN-LAST:event_comboPincelItemStateChanged

    private void comboFondoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFondoItemStateChanged
        // TODO add your handling code here:
        lienzo1.setColorFondo(colores[comboFondo.getSelectedIndex()]);
        lienzo1.repaint();
    }//GEN-LAST:event_comboFondoItemStateChanged

    private void lienzo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzo1MouseMoved
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            lienzo1.pinta(new Point(evt.getX(),evt.getY()),barraGrosor.getValue());
        } catch (InterruptedException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        lienzo1.repaint();
    }//GEN-LAST:event_lienzo1MouseMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Ventana frame = new Ventana();
        frame.setTitle("Lienzo");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider barraGrosor;
    private javax.swing.JComboBox<String> comboFondo;
    private javax.swing.JComboBox<String> comboPincel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private prac3.Lienzo lienzo1;
    // End of variables declaration//GEN-END:variables
}
