package oopsintroduction.coupling.high;

public class Customer {
    public void placeOrder(){
        Order order = new Order();
        order.createOrder();
    }
}
