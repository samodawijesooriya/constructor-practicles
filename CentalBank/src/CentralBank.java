public class CentralBank {
    int getInterestRate(){
        return 0;
    }
}
class BOC extends CentralBank{
    @Override
    int getInterestRate() {
        return 10;
    }
}
class PeoplesBank extends CentralBank{
    @Override
    int getInterestRate() {
        return 11;
    }
}
class CommercialBank extends CentralBank{
    @Override
    int getInterestRate() {
        return 20;
    }
}
class TestOveririding{
    public static void main(String[] args) {
        BOC b= new BOC();
        PeoplesBank p = new PeoplesBank();
        CommercialBank c = new CommercialBank();
        System.out.println("Interest Rate BOC:- " + b.getInterestRate());
        System.out.println("Interest Rate PeoplesBank:- " + p.getInterestRate());
        System.out.println("Interest Rate CommercialBank:- " + c.getInterestRate());
    }
}