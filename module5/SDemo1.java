package module5;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;  
public class SDemo1 {
	
public static void main(String args[])
{
		JFrame f = new JFrame("My Frame title");
		f.setTitle("My new Frame title");
		JPanel p = new JPanel( );
		JLabel l=new JLabel("My Label");  
	    l.setBounds(20,100, 100,20); 
	     p.add(l);
		JButton b = new JButton("My press me Button");
		b.setBounds(50,50,150, 40);   
		p.add(b);
		JButton b1=new JButton(new ImageIcon("C:\\icon.jpg"));    
		b1.setBounds(100,100,150, 40);    
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
		String courses[] = { "core java","advance java", "java servlet"};
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
	        JScrollBar s=new JScrollBar();  
	        s.setBounds(170,150, 50,100);  
	        p.add(s);  
	        JProgressBar jb=new JProgressBar(0,2000);    
	        jb.setBounds(10,10,160,30);         
	        jb.setValue(0);    
	        jb.setStringPainted(true);    
	        p.add(jb);
	        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
	        slider.setBounds(35,330,100,50);     
	        p.add(slider); 
	        JPanel p1=new JPanel();  
	       
	        JPanel p2=new JPanel();  
	        JPanel p3=new JPanel(); 
	        JTabbedPane tp=new JTabbedPane();  
	        tp.setBounds(50,390,200,200);  
	        tp.add("main",p1);  
	        tp.add("visit",p2);  
	        tp.add("help",p3);    
	        p.add(tp);  
	        String data[][]={ {"101","Amit","670000"},    
                    {"102","Jai","780000"},    
                    {"101","Sachin","700000"}};    
String column[]={"ID","NAME","SALARY"};         
 JTable jt=new JTable(data,column); 
 JScrollPane sp=new JScrollPane(jt);
 sp.setBounds(350,390,200,200);
 p.add(sp);  
 DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");  
 DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");  
 DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");  
 style.add(color);  
 style.add(font);  
 DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");  
 DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");  
 DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");  
 DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");  
 color.add(red); color.add(blue); color.add(black); color.add(green);      
 JTree jt1=new JTree(style);  
 p.add(jt1); 
 jt1.setBounds(570,400,200,200);
		// add button to panel
		f.setContentPane(p); 
		// add panel to frame
		f.setSize(750,750);
		f.setLayout(null);
		//using Flow layout managers  
		f.show();
		}
}
