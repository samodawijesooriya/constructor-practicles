public class Parent {
    String name;
    void display(){
        System.out.println("Super class is running");
    }
}
class Child extends Parent{
    int age;

    @Override
    void display() {
        System.out.println("Sub class is running");
    }
}
class downcasting{
    public static void main(String[] args) {
        Parent p = new Child();     //upcasted object
        p.name = "Gawesh";
        Child c = (Child) p;
        c.age = 10;
        System.out.println(c.name);
        System.out.println(c.age);
        c.display();
    }
}