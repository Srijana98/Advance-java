package lab1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ques1 extends Frame {
    
    private TextField customerNameField;
    private TextField numberOfToppingsField;
    private CheckboxGroup pizzaSizeGroup;
    private TextArea outputArea;
    
    public ques1() {
        setTitle("Rocky Woodfired Pizzas Management System");
        setSize(500, 400);
        setLayout(new GridLayout(6, 2));

        // Customer Name
        add(new Label("Customer Name:"));
        customerNameField = new TextField();
        add(customerNameField);

        // Number of Toppings
        add(new Label("Number of toppings:"));
        numberOfToppingsField = new TextField();
        add(numberOfToppingsField);

        // Pizza Size
        add(new Label("Size:"));
        pizzaSizeGroup = new CheckboxGroup();
        Panel sizePanel = new Panel(new FlowLayout(FlowLayout.LEFT));
        sizePanel.add(new Checkbox("Small", pizzaSizeGroup, true));
        sizePanel.add(new Checkbox("Medium", pizzaSizeGroup, false));
        sizePanel.add(new Checkbox("Large", pizzaSizeGroup, false));
        add(sizePanel);

        // Output Area
        outputArea = new TextArea();
        add(outputArea);

        // Buttons
        Panel buttonPanel = new Panel(new FlowLayout());
        Button enterButton = new Button("Enter");
        Button displayAllButton = new Button("Display All");
        Button searchButton = new Button("Search");
        Button exitButton = new Button("Exit");
        
        buttonPanel.add(enterButton);
        buttonPanel.add(displayAllButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(exitButton);
        add(buttonPanel);

        // Action Listeners for Buttons
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String customerName = customerNameField.getText();
                int toppings = Integer.parseInt(numberOfToppingsField.getText());
                String size = pizzaSizeGroup.getSelectedCheckbox().getLabel();

                // Create Pizza object
                Pizza pizza = new Pizza(customerName, size, toppings);
                outputArea.setText("Customer Name: " + pizza.getCustomerName() + "\n" +
                                   "Size: " + pizza.getSize() + "\n" +
                                   "Number of Toppings: " + pizza.getNumberOfToppings());
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ques1();
    }
}





