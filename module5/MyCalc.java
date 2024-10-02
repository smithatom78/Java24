package module5;
import java.awt.event.*;
import javax.swing.*;
public class MyCalc implements ActionListener{
JButton b1,b2,b3,b4;
JTextField t1;
String s1="";
MyCalc()
{
	JFrame f = new JFrame("My Calculator-Smitha");
	JPanel p = new JPanel( );
	p.setLayout(null);
	f.setSize(400,500);
	t1 = new JTextField();
	t1.setBounds(100,100,200,30);
	b1 = new JButton("1");
	b1.setBounds(100,140,50,30);
	b2 = new JButton("2");
	b2.setBounds(150,140,50,30);
	b3 = new JButton("3");
	b3.setBounds(200,140,50,30);
	b4 = new JButton("+");
	b4.setBounds(250,140,50,30);
	p.add(t1);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	f.setContentPane(p); 
	// add panel to frame
	//f.setSize(400,500);
	f.setVisible(true);
}
	public void actionPerformed(ActionEvent e)
	{String s = e.getActionCommand();
	s1=s1+s;
	t1.setText(s1);
	}
	public static void main(String args[])
	{
	new MyCalc();
	}
}
