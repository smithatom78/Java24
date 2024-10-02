package module5;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SDemo3 {
	public static void main(String args[])
	{
			JFrame f = new JFrame("My Frame title");
			JPanel p = new JPanel();
			
			//components
			JLabel l=new JLabel("My Label");  
	        l.setBounds(20,100, 100,20); 
	        p.add(l);
			JButton b = new JButton("My press me Button");
			b.setBounds(50,50,150, 40);   
			p.add(b);
			JButton b1=new JButton(new ImageIcon("D:\\icon.png"));    
			b1.setBounds(100,100,100, 40);    
			p.add(b1);    
			JTextField tf=new JTextField("My Text Field");
			tf.setBounds(230,100,100, 40);    
			p.add(tf);
			 JPasswordField pf = new JPasswordField("My pass field");   
		     pf.setBounds(300,65,100,30);
		     p.add(pf);
		      JTextArea area=new JTextArea("My Text Area");  
		       area.setBounds(250,160, 200,200);  
		       p.add(area);  
		       
		   	String courses[] = {"PHP","Python", "core java","advance java", "java servlet"};
			JComboBox c = new JComboBox(courses);
			c.setBounds(240,40,90,20);
			p.add(c);
			  JCheckBox checkBox1 = new JCheckBox("My Checkbox1");  
		        checkBox1.setBounds(20,200, 150,50);  
		        JCheckBox checkBox2 = new JCheckBox("My Checkbox2", true);  
		        checkBox2.setBounds(20,230, 150,50);  
		        p.add(checkBox1);  
		        p.add(checkBox2);  
		        JRadioButton r1=new JRadioButton("Male");    
		        JRadioButton r2=new JRadioButton("Female");    
		        r1.setBounds(35,280,100,30);    
		        r2.setBounds(35,300,100,30);    
		        ButtonGroup bg=new ButtonGroup();    
		        bg.add(r1);bg.add(r2);    
		        p.add(r1);p.add(r2);  
			f.setContentPane(p); 
			f.setSize(750,750);
			f.setLayout(null);
			f.setVisible(true);
	}
}
