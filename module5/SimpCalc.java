package module5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpCalc implements ActionListener{
	
JTextField t1,t2,t3;
JButton ad,su;
SimpCalc(){
JFrame f = new JFrame("grid");
JPanel p = new JPanel( );
p.setLayout(new GridLayout(4,2));
JLabel l1=new JLabel("num1");
t1=new JTextField();
JLabel l2=new JLabel("num2");
t2=new JTextField();
JLabel l3=new JLabel("Result");
 t3=new JTextField("");
ad = new JButton("Add");
su = new JButton("Sub");
p.add(l1);
// add controls to panel
p.add(t1);
p.add(l2);
p.add(t2);
p.add(ad);
p.add(su);
p.add(l3);
p.add(t3);
ad.addActionListener(this);
su.addActionListener(this);
f.setContentPane(p); 
// add panel to frame
f.setSize(400,500);
f.setVisible(true);
}public void actionPerformed(ActionEvent e)
{  
	 int c=0;
	  String s1=t1.getText();
	  String s2=t2.getText();
	  int a=Integer.parseInt(s1);
	  int b=Integer.parseInt(s2);
	if(e.getSource()==ad)
		{ c=a+b;}
	else if(e.getSource()==su)
		{ c=a-b;}
	String rs=String.valueOf(c);
	t3.setText(rs); }
	public static void main(String args[])
	{
	new SimpCalc();
	}
	}