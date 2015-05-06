/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.uksw.wmp.prja.laboratorium10;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.EventListener;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author csi
 */
public class View extends JFrame{
    
        public View() {
            setTitle("Laboratorium 10"); // Nadajemy nazwę okienka (będzie się wyświetlać na niebieskim pasku programu)
            setSize(740,400); // Określamy wymiary okienka w pikselach (160 szerokości, 250 wysokości)


            MojPanel p=new MojPanel(); // Tworzymy nowy obiekt typu "MójPanel" (dalej nazywamy go "panel"), który zaraz stworzymy
            Container powzaw=getContentPane(); // tworzymy obiekt "powzaw" który stanowi powierzchnię okienka. 
            powzaw.add(p); // do tej powierzchni dodajemy panel, który stworzyliśmy dwie linijki wyżej


        };



    
}
