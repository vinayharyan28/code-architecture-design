package basicconsepts;

public class Main {
    public static void main(String[] args) {
        EnumCheck today = EnumCheck.TUESDAY;
        System.out.println("It's Tuesday " + today);
        TrafficLight trafficLight = TrafficLight.RED;
        System.out.println(trafficLight.getDescription());
    }
}
