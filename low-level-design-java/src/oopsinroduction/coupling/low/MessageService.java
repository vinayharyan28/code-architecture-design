package oopsinroduction.coupling.low;

// Low Coupling suppose we have a simple message system with low coupling.
// We have two classes 'MessageSender' and 'MessageReceiver' which communication through an interface 'MessageService'
// Low coupling means that one module or class is not heavily dependent on the internal details of another module.
// Changes in one module should have minimal impact on other modules.

public interface MessageService {
    void sendMessage(String message);
}
