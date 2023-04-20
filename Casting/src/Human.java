public class Human {
    void printData(){
        System.out.println("method of super class!");
    }
}
class Man extends Human{
    @Override
    void printData() {
        System.out.println("method of sub class!");
    }
}
class Test {
    public static void main(String[] args) {
        Human h1 = new Man();
        Human h2 = new Man();
        h1.printData();
        h2.printData();
    }
}
