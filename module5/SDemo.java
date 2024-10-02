package module5;
import javax.swing.*;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;
class SDemo implements ActionListener{
	SDemo()
	{
		JFrame f = new JFrame("My Frame title");
		JPanel p = new JPanel( );
		JButton b = new JButton("My press me Button");
		Label l=new Label("My Label");  
          p.add(l);
		TextField tf=new TextField("My Text Field");
	 	p.add(tf);
		// add button to panel
		f.setContentPane(p); 
		// add panel to frame
		f.setSize(400,500);
		f.setVisible(true);
		b.addActionListener (this);
		}
	 public void actionPerformed (ActionEvent e)
	    {
	       
	       
	    }
public static void main(String args[])
{		
		new SDemo();
}
}
