
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15104
 */
public class TextFrame extends JFrame {
    private Model data;
    private JPanel contentPane;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    public TextFrame(Model dm){
         data=dm;
         
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(100, 100, 800, 600);
         contentPane = new JPanel();
         contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
         setContentPane(contentPane);
         contentPane.setLayout(null);
  
         JLabel lblNum1 = new JLabel("Red:");
         lblNum1.setBounds(46, 39, 61, 14);
         contentPane.add(lblNum1);
  
         JLabel lblNum2 = new JLabel("Green:");
         lblNum2.setBounds(46, 69, 61, 14);
         contentPane.add(lblNum2);
  
         JLabel lblNum3 = new JLabel("Blue:");
         lblNum3.setBounds(46, 103, 61, 14);
         contentPane.add(lblNum3);
  
         tf1 = new JTextField();
         tf1.setBounds(117, 36, 86, 20);
         contentPane.add(tf1);
         tf1.setColumns(10);
  
         tf2 = new JTextField();
         tf2.setBounds(117, 66, 86, 20);
         contentPane.add(tf2);
         tf2.setColumns(10);
  
         tf3 = new JTextField();
         tf3.setBounds(117, 97, 86, 20);
         contentPane.add(tf3);
         tf3.setColumns(10);
         
         JButton button=new JButton("update");
         button.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent event){
                    String s1=tf1.getText();
                    double value1=Double.parseDouble(s1);
                    
                    String s2=tf2.getText();
                    double value2=Double.parseDouble(s2);
                    
                    String s3=tf3.getText();
                    double value3=Double.parseDouble(s3);
                    
                    data.update(0, value1);
                    data.update(1, value2);
                    data.update(2, value3);
              }
         });
         button.setBounds(45, 138, 107, 37);
         contentPane.add(button);
         this.setVisible(true);
    }
}
