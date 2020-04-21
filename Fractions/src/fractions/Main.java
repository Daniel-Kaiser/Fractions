package fractions;

public class Main {

    public static void main(String[] args) {
        IFraction num1 = new Fraction(1,3).times(new Fraction(3,1));
        System.out.println(num1);
        IFraction num2 = new Fraction(1,3).plus(new Fraction(3,1));
        System.out.println(num2);
    }
    
}
