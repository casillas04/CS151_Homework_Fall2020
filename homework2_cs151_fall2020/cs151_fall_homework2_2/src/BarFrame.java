

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15104
 */
public class BarFrame extends JFrame implements ChangeListener{
    private Model DataModel;
    private ArrayList<Double>a;
    
    public BarFrame(Model dm){
        DataModel=dm;
        setSize(500,500);
        setVisible(true);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2=(Graphics2D)g;
        
        int y1=(int)(getHeight()-a.get(0)-15);
        g2.setColor(Color.RED);
        int a1=a.get(0).intValue();
        Rectangle rec1= new Rectangle(10,y1,50,a1);
        g2.draw(rec1);
        g2.fill(rec1);
        
        int y2=(int)(getHeight()-a.get(1)-15);
        g2.setColor(Color.GREEN);
        int a2=(int)a.get(0).intValue()/10*6;
        Rectangle rec2= new Rectangle(20,y1,50,a2);
        g2.draw(rec2);
        g2.fill(rec2);
        
        int y3=(int)(getHeight()-a.get(1)-15);
        g2.setColor(Color.BLUE);
        int a3=(int)a.get(0).intValue()/10*2;
        Rectangle rec3= new Rectangle(30,y1,50,a3);
        g2.draw(rec3);
        g2.fill(rec3);
    }
    
     public void stateChanged(ChangeEvent e){
       a=DataModel.getData();
       repaint();
    }
}
