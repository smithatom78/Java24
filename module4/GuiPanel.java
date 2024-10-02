package module4;
import javax.swing.*;
public class GuiPanel{
GuiPanel(){
JFrame a = new JFrame("example");
JPanel p = new JPanel();
p.setBounds(40,70,200,200);
JButton b = new JButton("click me");
b.setBounds(60,50,80,40);
p.add(b);
a.add(p);
a.setSize(300,300);
a.setLayout(null);
a.setVisible(true);
}
public static void main(String args[])
{new GuiPanel();
}}