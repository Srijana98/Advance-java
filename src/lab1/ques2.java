package lab1;
class ques2 {
    private String customerName;
    private String size;
    private int numberOfToppings;

    // Constructor
    public ques2(String customerName, String size, int numberOfToppings) {
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



