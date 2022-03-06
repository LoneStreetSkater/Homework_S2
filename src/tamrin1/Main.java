package tamrin1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Division div = new Division();
        Multiplication multi = new Multiplication();
        System.out.println("Enter 1.for addition \n 2.for submission \n 3.for division \n 4.for multiplication: ");
        int c = input.nextInt();
        switch (c){
            case 1:
                add.calc();
                System.out.println(add.addition());
                break;
            case 2:
                sub.calc();
                System.out.println(sub.subtraction());
                break;
            case 3:
                div.calc();
                System.out.println(div.division());
                break;
            case 4:
                multi.calc();
                System.out.println(multi.multiplication());
                break;
            default:
                System.out.println("Unexpected character");
        }
    }
}
