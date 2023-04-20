import com.sun.xml.internal.ws.api.ha.HaInfo;

public abstract class Human {
    abstract void eat();
    abstract void walk();
    void breathing(){
        System.out.println("breathing");
    }
}
class Man extends Human{
    @Override
    void eat() {
        System.out.println("eat anything");
    }
    @Override
    void walk() {
        System.out.println("any kind of walk");
    }
    @Override
    void breathing() {
        super.breathing();
        System.out.println("lab dab");
    }
}
class Gawesh extends Man{
    @Override
    void breathing() {
        super.breathing();
        System.out.println("lab dab");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Eating food");
    }
    @Override
    void walk() {
        super.walk();
        System.out.println("running");
    }
}
class Running {
    public static void main(String[] args) {
    Human h1 = new Man();
    Human h2 = new Gawesh();
    Man h3 = new Gawesh();
    h1.breathing();
    h1.eat();
    h1.walk();
        h2.breathing();
        h2.eat();
        h2.walk();
        h3.breathing();
        h3.eat();
        h3.walk();
}
}