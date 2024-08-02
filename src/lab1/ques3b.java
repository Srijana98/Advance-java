package lab1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ques3b extends Frame {

    private TextField customerNameField;
    private TextField numberOfToppingsField;
    private CheckboxGroup pizzaSizeGroup;
    private TextArea outputArea;

    // List to store Pizza objects
    private ArrayList<Pizza> pizzaList = new ArrayList<>();

    public ques3b() {
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

                // Create Pizza object and add to the list
                Pizza pizza = new Pizza(customerName, size, toppings);
                pizzaList.add(pizza);

                // Display the latest Pizza object in the text area
                outputArea.append("Customer Name: " + pizza.getCustomerName() + "\n" +
                                   "Size: " + pizza.getSize() + "\n" +
                                   "Number of Toppings: " + pizza.getNumberOfToppings() + "\n\n");
            }
        });

        displayAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputArea.setText(""); // Clear the text area
                outputArea.append("Customer Name\tGarments\tCharge\n");
                outputArea.append("----------------------------------------\n");

                for (Pizza pizza : pizzaList) {
                    double charge = calculateCharge(pizza.getSize(), pizza.getNumberOfToppings());
                    outputArea.append(pizza.getCustomerName() + "\t" +
                                      pizza.getNumberOfToppings() + "\t" +
                                      charge + "\n");
                }
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

    private double calculateCharge(String size, int toppings) {
        double basePrice;
        switch (size) {
            case "Small":
                basePrice = 5.00;
                break;
            case "Medium":
                basePrice = 7.50;
                break;
            case "Large":
                basePrice = 10.00;
                break;
            default:
                basePrice = 5.00;
        }
        return basePrice + (toppings * 2.00);
    }

    public static void main(String[] args) {
        new PizzaManagementSystem();
    }
}

class Pizza {
    private String customerName;
    private String size;
    private int numberOfToppings;

    // Constructor
    public Pizza(String customerName, String size, int numberOfToppings) {
        this.customerName = customerName;
        this.size = size;
        this.numberOfToppings = numberOfToppings;
    }

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }
}


