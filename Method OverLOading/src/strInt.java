public class strInt {
    void display(double a){
        System.out.println("double !");
    }
    void display(String b) {
        System.out.println("String !");
    }
    public static void main(String[] args) {
        strInt dis =  new strInt();
        dis.display(3934.89);
        dis.display("samoda");  // wena method ekk thiyena ekkk gann object ekk create kra;la gannt wenw
    }

}
//static damma nm display's methods walata object eka nathuwa main eke liyannata thibba