package oopsintroduction.coupling.high;

// High coupling indicates a strong dependency between different modules, making them tightly interconnected.
// Changes in one module can have a significant impact on other modules.

public class Order {
    public void createOrder(){
        // Code to create an order
    }
}

// In this example, the Customer class is tightly coupled to the Order class.
// It directly creates an instance of Order and calls its methods.
// If you needed to change the order creation process or introduce a new order type,
// you would have to modify the Customer class, indicating high coupling.