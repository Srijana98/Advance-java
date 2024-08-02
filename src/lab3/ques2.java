package lab3;
import javax.swing.*;
import java.awt.*;

public class ques2{
    public static void main(String[] args) {
        // Create a new JFrame (main window)
        JFrame frame = new JFrame("Personal Information");

        // Set the default close operation (exit the application when the window is closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel to hold the components and set the layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Margin around components

        // Create labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");

        // Create text fields
        JTextField nameField = new JTextField(20);
        JTextField emailField = new JTextField(20);

        // Create and load the image icon
        ImageIcon icon = new ImageIcon("path_to_your_image_icon.png"); // Replace with your image path
        JLabel iconLabel = new JLabel(icon);

        // Add the icon to the panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2; // Span two rows
        panel.add(iconLabel, gbc);

        // Add the name label to the panel
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1; // Reset to one row
        panel.add(nameLabel, gbc);

        // Add the name text field to the panel
        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(nameField, gbc);

        // Add the email label to the panel
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(emailLabel, gbc);

        // Add the email text field to the panel
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(emailField, gbc);

        // Add the panel to the frame
        frame.add(panel);

        // Set the size of the window and make it visible
        frame.pack();
        frame.setVisible(true);
    }
}


