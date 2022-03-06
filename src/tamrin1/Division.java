package tamrin1;

public class Division extends Calculator {
    public float division() {
        if (num2 == 0)
            System.out.println("Undefined");
        else
            result = num1 / num2;
        return result;
    }

}
