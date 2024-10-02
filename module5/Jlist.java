package module5;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Jlist  implements ItemListener {
	
	Choice myList;
	JLabel label;
	Jlist(){
		 JFrame f = new JFrame("My Frame title");
			JPanel p = new JPanel( );
myList = new Choice();
	myList.add("CSE");
	myList.add("ECE");
	myList.add("EEE");
	myList.add("IT");
	p.add(myList);
	label=new JLabel(".....My lABEL..................");
	p.add(label);
	myList.addItemListener(this);
	f.setContentPane(p);
	f.setVisible(true);
	f.setSize(640,480);
	f.setLayout(null);	
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		String data ;  
        if (myList.getSelectedIndex() != -1) {                       
           data = "Branch Selected: " + myList.getSelectedItem();   
           label.setText(data);  
        } 
	}
	  public static void main(String[] args) {  
		 new Jlist();
	  }
	
	  
}
