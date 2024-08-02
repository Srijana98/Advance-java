package lab4;
import javax.swing.*;
import java.awt.*;

public class ques3 extends JFrame {

    public ques3() {
        setTitle("JTabbedPane Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Home Tab
        JPanel homePanel = new JPanel();
        homePanel.add(new JLabel("Welcome to the Home Tab!"));
        tabbedPane.addTab("Home", homePanel);

        // Profile Tab
        JPanel profilePanel = new JPanel(new GridLayout(2, 2));
        profilePanel.add(new JLabel("Name:"));
        profilePanel.add(new JTextField());
        profilePanel.add(new JLabel("Email:"));
        profilePanel.add(new JTextField());
        tabbedPane.addTab("Profile", profilePanel);

        // Settings Tab
        JPanel settingsPanel = new JPanel();
        settingsPanel.add(new JLabel("Settings"));
        settingsPanel.add(new JButton("Save"));
        tabbedPane.addTab("Settings", settingsPanel);

        // Add the tabbed pane to the frame
        add(tabbedPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ques3();
    }
}

