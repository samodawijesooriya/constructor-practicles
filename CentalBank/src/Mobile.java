public class Mobile {
    void displayName(){
        System.out.println("smart mobile");
    }
}
class Samsung extends Mobile{
    void displayName(){
        System.out.println("Samsung Galaxy s23 ultra");
        super.displayName();
    }
}
class Apple extends Samsung{
    @Override
    void displayName() {
        System.out.println("Iphone 14 pro");
        super.displayName();
    }
}
class test{
    public static void main(String[] args) {
        Apple a= new Apple();
        Samsung s= new Samsung();
        s.displayName();
        a.displayName();
    }
}
