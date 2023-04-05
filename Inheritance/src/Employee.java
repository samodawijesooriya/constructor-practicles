public class Employee {
    static int alary = 50000;
}
class Labour extends Employee{
        static int bonus = 10000;
        public static void main(String[] args) {
            //Labour l = new Labour();
            System.out.println("Salary is " + alary);
            System.out.println("bonus is "+ bonus);
        }
}

