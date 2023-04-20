public class Animal {
    String name;
    void setName(){
        System.out.println("Elephant");
    }
}
class Fish extends Animal{
    String color;

    @Override
    void setName() {
        System.out.println("BLue fish");
    }
}
class Run{
    public static void main(String[] args) {
        Animal a = new Fish();
        a.name= "alaguduwa";
        Fish f = new Fish();
        f.name = "linna";
        f.color = "gray";
        System.out.println("Name -: "+ a.name);
        a.setName();
        System.out.println("Name -: "+ f.name);
        System.out.println("color :- "+ f.color);
    }
}