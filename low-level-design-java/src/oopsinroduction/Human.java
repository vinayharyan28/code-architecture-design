package oopsinroduction;

//Memory management in java
//Clone
//Why main method is static
//this and super
//Diamond problem
//Python support hybrid and Multiple
//Cohesion
//Coupling
//Association
//Aggregation
//Composition

/**
 Memory management in Java is the process of allocating and managing memory resources for objects and data structures during the execution of a Java program. Unlike languages like C or C++, Java abstracts much of the low-level memory management tasks from the programmer to provide a more reliable and secure environment. Here are the key aspects of memory management in Java:
 1. Automatic Memory Allocation: In Java, memory allocation for objects is automatic. When you create an object using the `new` keyword, Java automatically allocates memory for the object on the heap. You don't have to explicitly allocate or deallocate memory as you do in languages like C or C++.
 2. Garbage Collection: Java has a built-in garbage collector that is responsible for reclaiming memory used by objects that are no longer reachable or referenced by the program. This process helps prevent memory leaks. The garbage collector periodically identifies and removes unreferenced objects, freeing up memory for reuse.
 3. Heap and Stack: In Java, memory is typically divided into two main areas: the heap and the stack. The heap is used for storing objects, while the stack is used for method call frames and local variables. Objects live on the heap, and references to objects can be stored on the stack.
 4. Object Lifecycle: Objects in Java go through various stages during their lifecycle, including creation, referencing, de referencing, and garbage collection. The Java Virtual Machine (JVM) keeps track of these stages to ensure efficient memory management.
 5. Strong References: By default, references to objects in Java are strong references. As long as an object is reachable through strong references, it won't be garbage-collected. When an object is no longer reachable through strong references, it becomes a candidate for garbage collection.
 6. Weak and Soft References: Java also provides weak and soft references that allow objects to be collected by the garbage collector more aggressively. Weak references are typically used for caching, while soft references are used for objects that can be collected when memory is running low but have a higher priority than weakly referenced objects.
 7. OutOfMemoryError: In Java, if the heap memory is exhausted, an `OutOfMemoryError` is thrown, indicating that there is not enough memory available to allocate new objects. This error can be caught and handled, but it often indicates a need to optimize your code or allocate more memory to the JVM.
 8. Tuning and Profiling: In some cases, it may be necessary to tune the garbage collection behavior to optimize memory usage for specific applications. Tools like Java VisualVM or third-party profiling tools can help analyze and optimize memory usage in Java applications.
 In summary, memory management in Java is a critical aspect of the language, designed to abstract away low-level memory allocation and de allocation, making it easier for developers to create reliable and memory-efficient applications. The automatic memory management, garbage collection, and strong/weak references are key features that contribute to Java's memory management capabilities.
 */
public class Human {

    // Properties
    int age;
    int weight;
    String name;
    static int count=0; // Not belong to object, It belongs from class // Save space // Access without object
    // 1. one for all object.
    // 2. Required class property.
    // 3. Required less space.

    // 2 types of constructor
    // No-arguments constructor
    // Parameterized constructor

    // Rule
    // No return type
    // Name same as class name
    // No use abstract/static/final

    public Human(){
        count++;
        this.weight = 50;
    }

    public Human(int age, int weight, String name){
        this("vinay");
        count++;
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public Human(String name){ // Constructor overloading
        count++;
        this.name = name;
    }

    // Behavior
    void eat(){
        System.out.println("Eating...");
    }

    void sleep(){
        System.out.println("Sleeping...");
    }

    static void update(){
        count++; // One static function change only static properties // not use this and super
    }
}
