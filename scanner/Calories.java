package hommework3.scanner;

public class Calories {
    public static void main(String[] args) {
        double firstresult = squarePizza24(12);
        double secondresult = squarePizza28(14);
        double thirtresult = differenceCalori(secondresult,firstresult);
        System.out.println(thirtresult);


    }
    public static double squarePizza24(int radius)throws NullPointerException{
        double resultCaloriPizza24 = (3.14 * (radius * radius)) * 40;
        return resultCaloriPizza24;
    }
    public static double squarePizza28(int radius)throws NullPointerException{
        double resultCalloriPizza28 = (3.14 * (radius * radius)) * 40;
        return resultCalloriPizza28;}
    public static double differenceCalori(double resultCaloriPizza28,double resultCaloriPizza24)throws NullPointerException{
        double resultdifferensCalori = resultCaloriPizza28 - resultCaloriPizza24;
        return resultdifferensCalori;

    }

}
