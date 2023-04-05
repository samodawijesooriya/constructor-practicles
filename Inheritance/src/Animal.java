public class Animal {
    void eat() {
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void bark() {
        System.out.println("baw baw");
    }
}
class TestInheritance{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.bark();
    }
}