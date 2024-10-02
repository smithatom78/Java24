package module4;
import java.awt.*;
import java.awt.color.*;
import javax.swing.*;
import java.awt.event.*;
public class MouseListenerDemo extends JFrame implements MouseListener,MouseMotionListener{
	int X=0,Y=20;
	String msg="MouseEvents";
	public MouseListenerDemo(){
		addMouseListener(this); // link the frame with ML
	    setSize(500,400);
	    setVisible(true);
	    /*addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent e) {
	           System.exit(0);
	         }
	       });*/
		
		addMouseMotionListener(this);
		setBackground(Color.black);
		setForeground(Color.red);
	}
	
	public void mouseEntered(MouseEvent m){
		setBackground(Color.magenta);
		System.out.println("Mouse Entered");
		
	}
	public void mouseExited(MouseEvent m){
		setBackground(Color.black);
		System.out.println("Mouse Exited");
		
	}
	public void mousePressed(MouseEvent m){
		X=10;
		Y=20;
		msg="SJCET";
		setBackground(Color.green);
		System.out.println(m.getX() + "," + m.getY()+msg);
		
	}
	public void mouseReleased(MouseEvent m){
		X=10;
		Y=20;
		msg="Engineering";
		setBackground(Color.blue);
	
	}
	public void mouseMoved(MouseEvent m) {
		X=m.getX();
		Y=m.getY();
		msg="College";
		setBackground(Color.white);
		System.out.println("Mouse Moved");
		
	}
	public void mouseDragged(MouseEvent m){
		msg="CSE";
		setBackground(Color.yellow);
		System.out.println("Mouse Moved"+m.getX()+" "+m.getY());
		
	}
	public void mouseClicked(MouseEvent m){
		msg="SJCET";
		setBackground(Color.pink);
		System.out.println("Mouse Clicked");
		System.out.println(m.getX() + "," + m.getY()+" "+msg);
	}
	public static void main(String args[]){
	     new MouseListenerDemo();
	    
	}
}
