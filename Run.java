/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.uksw.wmp.prja.laboratorium10;

import javax.swing.JFrame;

/**
 *
 * @author csi
 */
public class Run{
    
    public static void main(String[] args) {
        // TODO code application logic here
        View view=new View(); // tworzymy nowy obiekt typu Okno (dalej będziemy o nim mówić "okienko"), który zaraz stworzymy
        
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // zamknięcie okienka ma być jednoznaczne z zamknięciem programu
        view.setVisible(true); // nasze okienko ma być widoczne
    }
}
