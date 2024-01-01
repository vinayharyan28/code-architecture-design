package basicconsepts;

public class ConstructorChaining {
    private int x;
    private String message;

    // First constructor with two parameter
    public ConstructorChaining(int x, String message){
        this.x = x;
        this.message = message;
        System.out.println("3 constructor");
    }

    // Second constructor that chains to the first constructor
    public ConstructorChaining(int x){
        // Calling the first constructor with default message
        this(x, "Default Message");
        System.out.println("2 constructor");
    }

    // Third constructor that chains to the second constructor
    public ConstructorChaining(){
        // Calling the second constructor with default value for x
        this(0);
        System.out.println("1 constructor");
    }

    public static void main(String[] args) {
        ConstructorChaining constructorChaining = new ConstructorChaining();

    }
}
