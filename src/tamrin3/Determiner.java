package tamrin3;

public class Determiner implements MyInteger{

    @Override
    public void isEven() {
        System.out.print("even.");
    }

    @Override
    public void isOdd() {
        System.out.print("odd.");
    }

    @Override
    public void isPositive() {
        System.out.print("This number is positive and ");
    }

    @Override
    public void isNegative() {
        System.out.print("This number is negative and ");
    }

    @Override
    public void isZero() {
        System.out.print("This number is zero, which is ");
    }
}
