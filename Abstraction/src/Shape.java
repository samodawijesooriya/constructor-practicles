public abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}
class Test2{
    public static void main(String[] args) {
    Shape s1= new Rectangle();
    Shape s2= new Circle();
    s1.draw();
    s2.draw();
}}