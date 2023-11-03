package designprinciple;

public interface InterfaceMethodImplementation {
    void hi();
    default public void hello(){
        System.out.println("Hello!");
    }

}
