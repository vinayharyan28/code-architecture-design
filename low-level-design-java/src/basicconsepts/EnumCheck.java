package basicconsepts;
/**
 * `enum` is a keyword that is used to declare an enumeration type, which is a special data type used to define a set of constants with fixed set of values.
 * An enumeration, often referred to as an `enum`, is a collection of named values, and each value is typically associated with an integer or ordinal value.

 * In this example, we have defined an enum called `Day` with seven constant values representing the days of the week.
 * Each constant value is implicitly assigned an ordinal value, starting from 9 for the first constant (`SUNDAY`) and increasing by 1 for each subsequent constant

 * You can use enums in java to represent a finite set of related values or options.
 * They are often to improve code readability and maintainability by providing descriptive names for specific values, rather than using plain integers or strings.

 * Enums can also have fields, methods, and constructors, allowing you to define more complex behaviors for each enum constant.
 * Enums are commonly used in switch statements and as a replacement for sets of integer constants.*/

public enum EnumCheck {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
}

enum TrafficLight {
    RED("STOP"),
    YELLOW("Prepare to stop"),
    GREEN("GO");
    private final String description;

    TrafficLight(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}

// In this example, the `TrafficLight` enum has a description field and a method `getDescription()` that provides a textual description for each traffic light color.
// Enums are a powerful feature in java that can make your code more robust, readable, and maintainable when dealing with sets of related values.