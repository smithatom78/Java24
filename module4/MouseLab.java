package module4;
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;  
public class MouseLab extends JFrame implements MouseMotionListener{
	String txt="";
	Graphics g;
	public MouseLab(){
		addMouseMotionListener(this);
		setSize(500,500);
	    setVisible(true);
	    
	}
	public void mouseMoved(MouseEvent me)
	{
	txt="hi my mouse is Moved";
	g=getGraphics();
	g.setColor(Color.BLACK);
	g.drawString(txt,me.getX(),me.getY());
	setTitle("Mouse Moved");
	}
	public void mouseDragged(MouseEvent me)
	{	System.out.println("Mouse is Dragged");
	 	g=getGraphics();  
	    g.setColor(Color.green);  
	    g.fillOval(me.getX(),me.getY(),5,5); 
	   
	  //g.fillRect(me.getX(),me.getY(),15,15); 
	    setTitle("Mouse Dragged");
	}
	public static void main(String args[]){
	     new MouseLab();
	}

}
