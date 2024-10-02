package module4;
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;  
public class MouseMotionListenerExample extends JFrame implements MouseMotionListener{  
    MouseMotionListenerExample(){  
        addMouseMotionListener(this);  
        setSize(500,300);  
        setLayout(null);  
        setVisible(true);  
    }  
public void mouseDragged(MouseEvent e) {  
	Graphics g=getGraphics();  
    g.setColor(Color.green);  
    g.fillRect(e.getX(),e.getY(),15,15); 
}  
public void mouseMoved(MouseEvent e) {
	
	Graphics g=getGraphics();  
    g.setColor(Color.red);  
    g.fillOval(e.getX(),e.getY(),10,10); 
}  
  
public static void main(String[] args) {  
    new MouseMotionListenerExample();  
}  
}  