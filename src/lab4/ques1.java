package lab4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ques1 extends JFrame {

    private JTextField celsiusField, fahrenheitField;

    public ques1() {
        setTitle("Temperature Converter");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(2, 2));

        JLabel celsiusLabel = new JLabel("Celsius:");
        celsiusField = new JTextField();
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        fahrenheitField = new JTextField();

        fahrenheitField.setEditable(false);

        add(celsiusLabel);
        add(celsiusField);
        add(fahrenheitLabel);
        add(fahrenheitField);

        celsiusField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                convertTemperature();
            }
        });

        setVisible(true);
    }

    private void convertTemperature() {
        try {
            double celsius = Double.parseDouble(celsiusField.getText());
            double fahrenheit = celsius * 9 / 5 + 32;
            fahrenheitField.setText(String.valueOf(fahrenheit));
        } catch (NumberFormatException e) {
            fahrenheitField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}


