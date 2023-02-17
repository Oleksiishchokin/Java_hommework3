package hommework3.scanner;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова-собака тигр ");

        String input = scanner.nextLine();
        System.out.println("Введены слова-" + input);


        String toogetherWord = new String(input.substring(0,3)+input.substring(7,9));
        System.out.println(toogetherWord);
    }


}
