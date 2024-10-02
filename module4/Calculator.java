package module4;
import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 
class Calculator extends JFrame implements ActionListener { 
  
 JTextField l; 
 String s0, s1, s2; 
 Calculator() 
 { 
 s0 = s1 = s2 = ""; 
 JFrame f  = new JFrame("calculator"); 
 l = new JTextField(16); 
 l.setEditable(false); 
 JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1; 
 b0 = new JButton("0"); 
 b1 = new JButton("1"); 
 b2 = new JButton("2"); 
 b3 = new JButton("3"); 
 b4 = new JButton("4"); 
 b5 = new JButton("5"); 
 b6 = new JButton("6"); 
 b7 = new JButton("7"); 
 b8 = new JButton("8"); 
 b9 = new JButton("9"); 
 beq1 = new JButton("="); 
 ba = new JButton("+"); 
 bs = new JButton("-"); 
 bd = new JButton("/"); 
 bm = new JButton("*"); 
 beq = new JButton("C"); 
 be = new JButton("."); 
 JPanel p = new JPanel(); 
 bm.addActionListener(this); 
 bd.addActionListener(this); 
 bs.addActionListener(this); 
 ba.addActionListener(this); 
 b9.addActionListener(this); 
 b8.addActionListener(this); 
 b7.addActionListener(this); 
 b6.addActionListener(this); 
 b5.addActionListener(this); 
 b4.addActionListener(this); 
 b3.addActionListener(this); 
 b2.addActionListener(this); 
 b1.addActionListener(this); 
 b0.addActionListener(this); 
 be.addActionListener(this); 
 beq.addActionListener(this); 
 beq1.addActionListener(this); 
 p.add(l); 
 p.add(ba); 
 p.add(b1); 
 p.add(b2); 
 p.add(b3); 
 p.add(bs); 
 p.add(b4); 
 p.add(b5); 
 p.add(b6); 
 p.add(bm); 
 p.add(b7); 
 p.add(b8); 
 p.add(b9); 
 p.add(bd); 
 p.add(be); 
 p.add(b0); 
 p.add(beq); 
 p.add(beq1); 
 p.setBackground(Color.pink); 
 f.add(p); 
 f.setSize(200, 220); 
 f.setVisible(true); 
 }
 public void actionPerformed(ActionEvent e) 
 { 
 String s = e.getActionCommand(); 
 if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') 
 { 
	 if (!s1.equals("")) 
		 s2 = s2 + s; 
	 else 
		 s0 = s0 + s; 
		 l.setText(s0 + s1 + s2); 
 } 
 else if (s.charAt(0) == 'C') 
 { 
	 s0 = s1 = s2 = ""; 
	 l.setText(s0 + s1 + s2); 
 } 
 else if (s.charAt(0) == '=') 
 { 
 double te; 
		 if (s1.equals("+")) 
			 te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
		 else if (s1.equals("-")) 
			 te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
		 else if (s1.equals("/")) 
			 te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
		 else 
			 te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
		 	l.setText(s0 + s1 + s2 + "=" + te); 
		 	s0 = Double.toString(te); 
		 	s1 = s2 = ""; 
 	} 
 	else 
 	{ 
		 if (s1.equals("") || s2.equals("")) 
		 s1 = s; 
		 else 
		 { 
		 double te; 
		 if (s1.equals("+")) 
			 te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
		 else if (s1.equals("-")) 
			 te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
		 else if (s1.equals("/")) 
			 te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
		 else 
			 te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
		 s0 = Double.toString(te); 
		 s1 = s; 
		 s2 = ""; 
		 } 
		 l.setText(s0 + s1 + s2); 
 	} 
 } 
 public static void main(String args[]) 
 { 
  Calculator c = new Calculator(); 
  } 
 } 
