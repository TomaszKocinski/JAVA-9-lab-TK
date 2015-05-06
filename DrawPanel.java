/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.uksw.wmp.prja.laboratorium10;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Iterator;
import javax.swing.JPanel;
import java.util.Vector;
/**
 *
 * @author csi
 */
class BaseForFigures{
    int x ;
    int y ;
    int x2 ;
    int y2 ;

    public BaseForFigures(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }
    
}
class Rectangle extends BaseForFigures{
   
    Boolean fill;

    public Rectangle(int x, int y, int x2, int y2,Boolean fill) {
        super(x, y, x2, y2);
        this.fill = fill;
    }
}
class Line extends BaseForFigures{
    String text;
    String text2;

    public Line(int x, int y, int x2, int y2,String text, String text2) {
        super(x, y, x2, y2);
        this.text = text;
        this.text2 = text2;
    }
}
enum Figure{
    Line,Rectangle;
}
public class DrawPanel extends JPanel{
    private Vector<Rectangle> VecOfRectangles;
    private Vector<Line> VecOfLines;
    private double areaSizeXInMeters = 100;
    private double areaSizeYInMeters = 100;
    int x = 125;
    int y = 50;
    private String xText = "Witaj!";
    int rX = 50;
    int rY = 10;
    String str="sda";
    String str2="dsa";
    Boolean fill = false;
    Boolean delete_prevoius = false;
    Boolean add_element = true;
    Figure LastFigure;
    public DrawPanel(String xText){
        VecOfRectangles=new Vector<>();
        VecOfLines=new Vector<>();
        LastFigure= Figure.Rectangle;
    }
    
    public void setText(String t){
        this.xText = t;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    public void setXr(int x){
        this.rX = x;
    }
    
    public void setYr(int y){
        this.rY = y;
    }
    public void setFill(boolean con){
        this.fill = con;
    }
    public boolean getFill(){
        return fill;
    }
    public void setDelete(boolean con){
        this.delete_prevoius = con;
    }
    public boolean getDelete(){
        return delete_prevoius;
    }
    public void setAddElement(boolean con){
        this.add_element = con;
    }
    public boolean getAddElement(){
        return add_element;
    }
    public void setLastFigure(Figure con){
        this.LastFigure = con;
    }
    public Figure getLastFigure(){
        return LastFigure;
    }
    public void setStr(String string){
        str = string;
    }
    public void setStr2(String string){
        str2 = string;
    }
    public void paintComponent(Graphics g) {
        super.setBackground(Color.WHITE);
        super.paintComponent(g);
        if (delete_prevoius) {
            VecOfRectangles.clear();
            VecOfLines.clear();
        }
        if ((add_element || delete_prevoius) && LastFigure.equals(Figure.Rectangle) ) {
            VecOfRectangles.add(new Rectangle(x, y, rX, rY, fill));
        }
        if ((add_element || delete_prevoius) && LastFigure.equals(Figure.Line)) {
            VecOfLines.add(new Line(x, y, rX, rY, str,str2));
        }
              
        for (Rectangle Rectangle : VecOfRectangles) {
            g.setColor(new Color(0, 255, 0));
            g.drawOval(Rectangle.x - Rectangle.x2, Rectangle.y - Rectangle.y2, Rectangle.x2 * 2, Rectangle.y2 * 2);
            if (Rectangle.fill) {
                g.fillOval(Rectangle.x - Rectangle.x2, Rectangle.y - Rectangle.y2, Rectangle.x2 * 2, Rectangle.y2 * 2);
            }
        }
        for (Line ElemOfLine : VecOfLines) {
             g.setColor(new Color(0, 0, 255));
            g.drawLine(ElemOfLine.x, ElemOfLine.y, ElemOfLine.x2, ElemOfLine.y2);
            g.drawString(ElemOfLine.text, ElemOfLine.x - 5, ElemOfLine.y + 5);
            g.drawString(ElemOfLine.text2, ElemOfLine.x2 - 5, ElemOfLine.y2 + 5);
            
        }
        
    }
    
}


