package module5;
import javax.swing.*;  
import java.awt.event.*;  
public class JlistDemo implements ActionListener 
{  JLabel label;
JList<String> list1;
	JlistDemo (){  
        JFrame f= new JFrame();  
         label = new JLabel();          
        label.setSize(500,100);  
        JButton b=new JButton("Show");  
        b.setBounds(200,150,80,30);  
        DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("Python");  
          l1.addElement("C++");  
          l1.addElement("Java");  
          l1.addElement("C");  
          l1.addElement("PHP");  
          l1.addElement("REACT");  
       list1 = new JList<>(l1);  
          list1.setBounds(100,100, 75,75);  
         
          f.add(list1); f.add(b); f.add(label);  
          f.setSize(450,450);  
          f.setLayout(null);  
          f.setVisible(true);  
          b.addActionListener(this);        		  
	}   		  
  public void actionPerformed(ActionEvent e) {   
                 String data ;  
                 if (list1.getSelectedIndex() != -1) {                       
                    data = "language Selected: " + list1.getSelectedValue();   
                    label.setText(data);  
                 }  
     
     }  
public static void main(String args[])  
    {  
   new JlistDemo();  
    }}  