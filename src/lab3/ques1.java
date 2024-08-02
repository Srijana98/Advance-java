package lab3;
import java.awt.*;
import java.awt.event.*;


	public class ques1 implements MouseListener{
	    private Frame f;
	    private Label hl;
	    private Panel p;
	    
	    public Question1(){
	        f = new Frame("Java MouseEvent Examples");
	        f.setSize(400, 400);
	        f.setLayout(new GridLayout(3, 1));
	        
	        hl=new Label("Mouse Entered",Label.CENTER);
	        
	        p = new Panel();
	        p.setLayout(new FlowLayout());
	        
	        f.addWindowListener(new WindowAdapter(){
	            public void windowClosing(WindowEvent e){
	                f.dispose();
	            }
	        });

	        f.addMouseListener(this);
	        
	      
	        
	        f.add(hl);
	        f.add(p);
	        f.setVisible(true);
	    }
	    

	    public void mouseClicked(MouseEvent e) {
	        hl.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
	    }

	    public void mouseEntered(MouseEvent e) {
	        hl.setText("Mouse Entered at (" + e.getX() + ", " + e.getY() + ")");
	    }

	    public void mouseExited(MouseEvent e) {
	        hl.setText("Mouse Exited at (" + e.getX() + ", " + e.getY() + ")");
	    }

	    public void mousePressed(MouseEvent e) {
	        hl.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
	    }

	    public void mouseReleased(MouseEvent e) {
	        hl.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
	    }

	    public static void main (String[] args){
	        new Question1();
	    }
	}




