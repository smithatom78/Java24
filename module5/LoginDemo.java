package module5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LoginDemo implements ActionListener{
JTextField t1;
JPasswordField t2;
JButton ad,su;JLabel l3;
LoginDemo(){
JFrame f = new JFrame("login");
JPanel p = new JPanel( );
p.setLayout(new GridLayout(4,2));
JLabel l1=new JLabel("UName");
 t1=new JTextField();
 JLabel l2=new JLabel("PWD");
 t2=new JPasswordField();
 ad = new JButton("Login");
 su = new JButton("Reset");
l3=new JLabel("");
p.add(l1);p.add(t1);
p.add(l2);p.add(t2);
p.add(ad);p.add(su);
p.add(l3);
ad.addActionListener(this);
su.addActionListener(this);
f.setContentPane(p); 
f.setSize(400,500);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{  
 String s1=t1.getText();
 String s2=t2.getText();
 String s=e.getActionCommand();
 
 if(s.equals("Login"))
 	{ 
	 if(s1.equals("admin")&& s2.equals("admin123"))
			 {
		 	l3.setText("welcome "+s1+" "+s2);
			 }
	 else
	 {
		 l3.setText("Invalid User");
	 }
 	}
 else 
	{ 
	t1.setText("");
	t2.setText(null);
	l3.setText("");
	}  
 }
public static void main(String args[])
{
new LoginDemo();
}
}