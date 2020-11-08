
import java.util.ArrayList;
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
public class Model {
    ArrayList<Double>data;
    ArrayList<ChangeListener>listeners;
    
    public Model(ArrayList<Double>d){
        data=d;
        listeners=new ArrayList<ChangeListener>();
    }
    
    public ArrayList<Double>getData(){
        return(ArrayList<Double>)(data.clone());
    }
    
    public void attach(ChangeListener c){
        listeners.add(c);
    }
    
    public void update(int location,double value){
       data.set(location,new Double(value));
       for(ChangeListener cl:listeners){
           cl.stateChanged(new ChangeEvent(this));
       }
    }
}
