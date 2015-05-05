/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.uksw.wmp.prja.laboratorium10;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author csi
 */
public class MojPanel extends JPanel {

    private int x = 50;
    private int y = 50;
    private String text = "";
    private String xText = "CH";

    private JRadioButton deleteRadioButton = new JRadioButton("Usuń wszystko");
    private JRadioButton addRadioButton = new JRadioButton("Dodaj objekt",true);

    private JLabel lab2 = new JLabel("Parametry elipsy");
    private JLabel xL = new JLabel("x:");
    private JTextField xF = new JTextField("0", 10);
    private JLabel xRL = new JLabel("rX:");
    private JTextField xRF = new JTextField("0", 10);
    private JLabel yL = new JLabel("y:");
    private JTextField yF = new JTextField("0", 10);
    private JLabel yRL = new JLabel("rY:");
    private JTextField yRF = new JTextField("0", 10);
    private JRadioButton fillRadioButton = new JRadioButton("Wypełnij");

    private JLabel lab3 = new JLabel("Współrzędne końców odcinku");
    private JLabel x1 = new JLabel("x1:");
    private JTextField xF1 = new JTextField("", 10);
    private JLabel y1 = new JLabel("y1:");
    private JTextField yF1 = new JTextField("", 10);
    private JLabel punkt1 = new JLabel("Punk1:");
    private JTextField punktF1 = new JTextField("", 10);
    private JLabel x2 = new JLabel("x2:");
    private JTextField xF2 = new JTextField("", 10);
    private JLabel y2 = new JLabel("y2:");
    private JTextField yF2 = new JTextField("", 10);
    private JLabel punkt2 = new JLabel("Punkt2:");
    private JTextField punktF2 = new JTextField("", 10);

    private JButton button1 = new JButton("Narysuj elipsę");
    private JButton button2 = new JButton("Narysuj odcinek");
    private JButton button3 = new JButton("Start moving");
    private JButton button4 = new JButton("Color changing");

    DrawPanel dp = new DrawPanel(xText);

    public MojPanel() {
        
        dp.paintComponents(null);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
                dp.setX(Integer.valueOf(xF.getText()));
                dp.setXr(Integer.valueOf(xRF.getText()));
                dp.setY(Integer.valueOf(yF.getText()));
                dp.setYr(Integer.valueOf(yRF.getText()));
                dp.setLastFigure(Figure.Rectangle);
                dp.repaint();
                 
            }
        });
        fillRadioButton.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(dp.getFill()){
                    dp.setFill(false);
                }
                else{
                    dp.setFill(true);
                }
            }
        });
        deleteRadioButton.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(dp.getDelete()){
                    dp.setDelete(false);
                }
                else{
                    dp.setDelete(true);
                }
            }
        });
        addRadioButton.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(dp.getAddElement()){
                    dp.setAddElement(false);
                }
                else{
                    dp.setAddElement(true);
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
                dp.setX(Integer.valueOf(xF1.getText()));
                dp.setXr(Integer.valueOf(yF1.getText()));
                dp.setY(Integer.valueOf(xF2.getText()));
                dp.setYr(Integer.valueOf(yF2.getText()));
                dp.setLastFigure(Figure.Line);
                dp.setStr(punktF1.getText());
                dp.setStr2(punktF2.getText());
                dp.repaint();
                 
            }
        });
        GroupLayout layoutMP = new GroupLayout(this);
        this.setLayout(layoutMP);
        layoutMP.setAutoCreateGaps(true);
        layoutMP.setAutoCreateContainerGaps(true);

        layoutMP.setHorizontalGroup(layoutMP.createSequentialGroup()
                .addComponent(dp, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGroup(layoutMP.createParallelGroup()
                        .addComponent(deleteRadioButton)
                        .addComponent(addRadioButton)
                        .addComponent(lab2)
                        .addGroup(layoutMP.createSequentialGroup()
                                .addComponent(xL)
                                .addComponent(xF)
                                .addComponent(xRL)
                                .addComponent(xRF)
                        )
                        .addGroup(layoutMP.createSequentialGroup()
                                .addComponent(yL)
                                .addComponent(yF)
                                .addComponent(yRL)
                                .addComponent(yRF)
                        )
                        .addComponent(fillRadioButton)
                        .addComponent(button1)
                        .addComponent(lab3)
                        .addGroup(layoutMP.createSequentialGroup()
                                .addComponent(x1)
                                .addComponent(xF1)
                                .addComponent(y1)
                                .addComponent(yF1)
                                .addComponent(punkt1)
                                .addComponent(punktF1)
                        )
                        .addGroup(layoutMP.createSequentialGroup()
                                .addComponent(x2)
                                .addComponent(xF2)
                                .addComponent(y2)
                                .addComponent(yF2)
                                .addComponent(punkt2)
                                .addComponent(punktF2)
                        )
                        .addComponent(button2)
                        .addGroup(layoutMP.createSequentialGroup()
                                .addComponent(button3)
                                .addComponent(button4)
                        )
                )
        );

        layoutMP.setVerticalGroup(layoutMP.createParallelGroup()
                .addComponent(dp, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGroup(layoutMP.createSequentialGroup()
                        .addComponent(deleteRadioButton)
                        .addComponent(addRadioButton)
                        .addComponent(lab2)
                        .addGroup(layoutMP.createParallelGroup()
                                .addComponent(xL)
                                .addComponent(xF)
                                .addComponent(xRL)
                                .addComponent(xRF)
                        )
                        .addGroup(layoutMP.createParallelGroup()
                                .addComponent(yL)
                                .addComponent(yF)
                                .addComponent(yRL)
                                .addComponent(yRF)
                        )
                        .addComponent(fillRadioButton)
                        .addComponent(button1)
                        .addComponent(lab3)
                        .addGroup(layoutMP.createParallelGroup()
                                .addComponent(x1)
                                .addComponent(xF1)
                                .addComponent(y1)
                                .addComponent(yF1)
                                .addComponent(punkt1)
                                .addComponent(punktF1)
                        )
                        .addGroup(layoutMP.createParallelGroup()
                                .addComponent(x2)
                                .addComponent(xF2)
                                .addComponent(y2)
                                .addComponent(yF2)
                                .addComponent(punkt2)
                                .addComponent(punktF2)
                        )
                        .addComponent(button2)
                        .addGroup(layoutMP.createParallelGroup()
                                .addComponent(button3)
                                .addComponent(button4)
                        )
                )
        );
    }

    Thread th;

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

}
