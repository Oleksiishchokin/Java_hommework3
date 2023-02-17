package hommework3.scanner;

public class Exchange {
    public static void main(String[] args) {

        double dollarExcheng = Excheng(10,.94);
        System.out.println(dollarExcheng);
    }
    public static double Excheng(double evro,double reit)throws NullPointerException{
        double dollars = evro * reit;
        return dollars;}
}
