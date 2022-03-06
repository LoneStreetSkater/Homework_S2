package tamrin3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer");
        String integer = input.nextLine();
        int num = Integer.parseInt(integer);
        Determiner determiner=new Determiner();
        if(num > 0)
            determiner.isPositive();
        else if(num < 0)
            determiner.isNegative();
        else
            determiner.isZero();

        if(num%2 == 0)
            determiner.isEven();
        else
            determiner.isOdd();
    }
}
