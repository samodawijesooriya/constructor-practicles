import com.sun.xml.internal.fastinfoset.algorithm.BuiltInEncodingAlgorithm;

public class World {
    String name;
    void process(){
        System.out.println("rotation");
    }
}
class Earth extends World{
    int area;
    void process(){
        System.out.println("Earth is a world");
    }
}
class testworld{
    public static void main(String[] args) {
        World w = new Earth();
        w.name = "Earth";
        System.out.println(w.name);
        w.process();
        Earth e = (Earth) w;
        e.area = 5000;
        System.out.println(e.name);
        System.out.println(e.area);
        e.process();
    }
}