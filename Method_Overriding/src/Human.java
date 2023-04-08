public class Human {
    void run() {
        System.out.println("Human can eat");
    }
    void drive(){

    }
}
class Gawesh extends Human{
    void run(){
        System.out.println("Gawesh can eat");
    }
    public static void main(String[] args) {
        Gawesh samo = new Gawesh();
        samo.run();
    }
}
