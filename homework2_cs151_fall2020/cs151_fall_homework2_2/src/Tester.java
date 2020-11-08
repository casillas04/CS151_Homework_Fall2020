
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15104
 */
public class Tester {
    public static void main(String []args){
      ArrayList<Double>data=new ArrayList<Double>();
        data.add(new Double(33.0));
        data.add(new Double(44.0));
        data.add(new Double(22.0));
        
        Model dm=new Model(data);
        
        TextFrame frame=new TextFrame(dm);
        BarFrame fram=new BarFrame(dm);
        dm.attach(fram);
      
    }
}
