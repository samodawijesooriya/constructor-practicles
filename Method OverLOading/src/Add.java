public class Add{
    int add(int a, int b){
        return a+ b;
    }
     static double add(double a, double b ){
        return a+ b;
     }
     static class TestOverLoading {
         public static void main(String[] args) {
             Add obj = new Add();
             System.out.println(obj.add(4, 10));
             System.out.println(add(5.5, 10.3));
         }
     }
}
