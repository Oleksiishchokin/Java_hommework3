package hommework3.scanner;

public class Main {
    public static void main(String[] args) {
        int firstResalt = addTwoNumbers(4,2);
        System.out.println(firstResalt);

        int secondResalt = subTwoNumbers(4,2);
        System.out.println(secondResalt);

        int thirddResalt = multTwoNumbers(4,2);
        System.out.println(thirddResalt);

        int vorthResalt =divTwoNumbers(10,2);
        System.out.println(vorthResalt);




    }
    public static int addTwoNumbers(int firstNumber,int secondNumber)throws NullPointerException{
        int resaltAdd = firstNumber + secondNumber;
        return resaltAdd;
    }
    public static int subTwoNumbers(int firstNumber,int secondNumber)throws NullPointerException{
        int resaltSub = firstNumber - secondNumber;
        return resaltSub;}

    public static int multTwoNumbers(int firstNumber,int secondNumber)throws NullPointerException{
        int resaltMult = firstNumber * secondNumber;
        return resaltMult;}

    public static int divTwoNumbers(int firstNumber,int secondNumber)throws NullPointerException{
        int resaltDiv = firstNumber / secondNumber;
        return resaltDiv;}




}
