package tamrin1;

import java.util.Scanner;

public class Calculator {
    float result, num1, num2;
    public void calc(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number: ");
        String num1S = input.nextLine();
        num1 = Float.parseFloat(num1S);
        System.out.print("enter the second number:");
        String num2S = input.nextLine();
        num2 = Float.parseFloat(num2S);
    }
}
