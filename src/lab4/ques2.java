package lab4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ques2 extends JFrame {

    private JTextField num1Field, num2Field;
    private JLabel resultLabel;

    public SumDifferenceCalculator() {
        setTitle("Sum and Difference Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 2));

        JLabel num1Label = new JLabel("Number 1:");
        num1Field = new JTextField();
        JLabel num2Label = new JLabel("Number 2:");
        num2Field = new JTextField();
        resultLabel = new JLabel("Result:");

        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);

        num1Field.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                calculateSum();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                calculateDifference();
            }
        });

        num2Field.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                calculateSum();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                calculateDifference();
            }
        });

        setVisible(true);
    }

    private void calculateSum() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double sum = num1 + num2;
            resultLabel.setText("Result: Sum = " + sum);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid Input");
        }
    }

    private void calculateDifference() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double difference = num1 - num2;
            resultLabel.setText("Result: Difference = " + difference);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new SumDifferenceCalculator();
    }
}



