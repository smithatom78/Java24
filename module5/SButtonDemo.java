package module5;
import java.awt.event.*;  
import javax.swing.*;    
public class SButtonDemo extends JFrame implements ActionListener {  
JTextField tf;
JLabel l;
SButtonDemo()
{
 //JFrame f=new JFrame("Button Example");  
    tf=new JTextField();  
    tf.setBounds(50,50, 150,20);  
    JButton b=new JButton("Click Here");
    b.setBounds(50,100,95,30);
    l=new JLabel("My Label");
    l.setBounds(100,100, 200,220);
    b.addActionListener(this);
    add(b);
    add(tf);  
    add(l);
   setSize(400,400);  
   setLayout(null);  
    setVisible(true);
 }
public void actionPerformed(ActionEvent e)
{ 
   tf.setText("Welcome to JavaSwing.");  
   l.setText("Hello from your Webmaster");
}  
public static void main(String[] args)
 {  
 new SButtonDemo();
}
  }
       