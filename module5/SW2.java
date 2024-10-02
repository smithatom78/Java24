package module5;
import java.awt.event.*;  
import javax.swing.*;    
public class SW2 implements ActionListener {  
JTextField tf;
SW2()
{
 JFrame f=new JFrame("Button Example");  
     tf=new JTextField();  
    tf.setBounds(50,50, 150,20);  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,100,95,30);  
    b.addActionListener(this);
    f.add(b);
    f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);}
public void actionPerformed(ActionEvent e)
{ 
   tf.setText("Welcome to JavaSwing.");  
}  
public static void main(String[] args)
 {  
 new SW2();
}
  }
       