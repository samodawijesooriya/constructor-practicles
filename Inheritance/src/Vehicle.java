public class Vehicle {
    void drive(){
        System.out.println("Driving");
    }

    void vehicleBreak() {
        System.out.println("breaking");

    }
    void reverse(){
        System.out.println("reverse");
    }
}
class car extends Vehicle{
    void motorRacing(){
        System.out.println("racing");
    }
}
class ModernCar extends car{
    void fly(){
        System.out.println("fying");
    }
}
class Boat extends Vehicle{
    void surf(){
        System.out.println("surfing");
    }
}
class ModernBoat extends Boat{
    void landRiding(){
        System.out.println("riding");
    }
}
class TestOutput{
    public static void main(String[] args) {
        ModernCar modernCar = new ModernCar();
        ModernBoat modernBoat = new ModernBoat();
        modernCar.drive();
        modernCar.vehicleBreak();
        modernCar.reverse();
        modernCar.motorRacing();
        modernCar.fly();

        modernBoat.drive();
        modernBoat.vehicleBreak();
        modernBoat.landRiding();
        modernBoat.surf();
        modernBoat.reverse();
    }
}