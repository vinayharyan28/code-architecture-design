package oopsintroduction.isa;

public class Multiple implements Interface1, Interface2{
    @Override
    public void method1() {
        System.out.println("Implementing method1 from Interface1");
    }

    @Override
    public void method2(){
        System.out.println("Implementing method2 from Interface2");
    }


}
