package lab5;
import java.awt.*;
import java.awt.event.*;

		public class ques11 extends Frame implements MouseListener {
	    private TextField textField1, textField2;
	    private Label resultLabel;

	    public ques1() {
	        // Set layout
	        setLayout(new FlowLayout());

	        // Create text fields for input
	        textField1 = new TextField(10);
	        textField2 = new TextField(10);

	        // Create label for output
	        resultLabel = new Label("");

	        // Add mouse listener to the frame
	        addMouseListener(this);

	        // Add components to the frame
	        add(new Label("Enter first number: "));
	        add(textField1);
	        add(new Label("Enter second number: "));
	        add(textField2);
	        add(resultLabel);

	        // Add window listener to handle close event
	        addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                dispose();
	            }
	        });

	        // Set frame properties
	        setTitle("Sum and Difference Calculator");
	        setSize(300, 150);
	        setVisible(true);
	    }

	    public void mouseClicked(MouseEvent e) {
	        // Calculate sum when mouse is clicked
	        int num1 = Integer.parseInt(textField1.getText());
	        int num2 = Integer.parseInt(textField2.getText());
	        int sum = num1 + num2;
	        resultLabel.setText("Sum: " + sum);
	    }

	    public void mouseReleased(MouseEvent e) {
	        // Calculate difference when mouse is released
	        int num1 = Integer.parseInt(textField1.getText());
	        int num2 = Integer.parseInt(textField2.getText());
	        int difference = num1 - num2;
	        resultLabel.setText("Difference: " + difference);
	    }

	    // Unused mouse listener methods
	    public void mousePressed(MouseEvent e) {}
	    public void mouseEntered(MouseEvent e) {}
	    public void mouseExited(MouseEvent e) {}

	    public static void main(String[] args) {
	        new ques1();
	    }
	}




