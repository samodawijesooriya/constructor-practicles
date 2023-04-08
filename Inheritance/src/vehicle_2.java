public class vehicle_2 {
    void drive(){
        System.out.println("Driving");
    }
    void vehicleBreak(){
        System.out.println("Breaking");
    }
    void reverse(){
        System.out.println("reverse");
    }
}
class Car extends vehicle_2{
        void motorRacing(){
            System.out.println("motor racing");
        }
        void covertble(){
            System.out.println("Convertable");
        }
}
class boat extends vehicle_2{
    void floating(){
        System.out.println("floating");
    }
    void surfing(){
        System.out.println("surfing");
    }
}
class modernBoat extends boat{
    void landRiding(){
        System.out.println("Land Riding");
    }
}
class modernCar extends Car{
    void fly(){
        System.out.println("flying");
    }
}

class TestInheritance1{
    public static void main(String[] args) {
        modernBoat newBoat = new modernBoat();
        modernCar newCar = new modernCar();

        newBoat.landRiding();
        newBoat.surfing();
        newBoat.floating();
        newCar.fly();
        newCar.covertble();
        newCar.motorRacing();
        newCar.drive();
        newCar.reverse();
        newCar.vehicleBreak();

    }
}