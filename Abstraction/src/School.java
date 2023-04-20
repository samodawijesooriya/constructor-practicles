public abstract class School {
    abstract void leaning();
    void teaching(){
        System.out.println("Teaching");
    }
}
class Grade11 extends School{
    @Override
    void leaning() {
        System.out.println("Grade 11 leaning well");
    }
    @Override
    void teaching() {
        super.teaching();
        System.out.println("Teachers teaching well");
    }
}
class Test4{
    public static void main(String[] args) {
        School s =new Grade11();
        s.leaning();
        s.teaching();
    }
}