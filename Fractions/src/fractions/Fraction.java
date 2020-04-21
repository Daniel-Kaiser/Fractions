package fractions;

import com.sun.istack.internal.NotNull;

public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(@NotNull Integer numerator, @NotNull Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    @NotNull
    public Integer getNumerator() {
        return numerator;
    }

    @Override
    @NotNull
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    @NotNull
    public IFraction plus(@NotNull IFraction other) {
       return normalize(numerator * other.getDenominator() + other.getNumerator() * denominator ,denominator * other.getDenominator());
       //return new Fraction(numerator * other.getDenominator() + other.getNumerator() * denominator ,denominator * other.getDenominator()));
    }

    @Override
    @NotNull
    public IFraction minus(@NotNull IFraction other) {
        return normalize(numerator * other.getDenominator() - other.getNumerator() * denominator,denominator * other.getDenominator());
        //return new Fraction(numerator * other.getDenominator() - other.getNumerator() * denominator,denominator * other.getDenominator());
    }

    @Override
    @NotNull
    public IFraction times(@NotNull IFraction other) {
        return normalize(numerator * other.getNumerator(),denominator * other.getDenominator());
        //return new Fraction(numerator * other.getNumerator(),denominator * other.getDenominator());
    }

    @Override
    @NotNull
    public IFraction dividedBy(@NotNull IFraction other) {
        return normalize(numerator * other.getDenominator(),denominator * other.getNumerator());
        //return new Fraction(numerator * other.getDenominator(),denominator * other.getNumerator());s
    }
    
    private static int greatestCommonDenominator(int a, int b){
        int t;
        while(b!= 0){
            t = a;
            a = b;
            b = t%b;
        }
        return a;
    }
    public IFraction normalize(int numerator, int denominator ){
        int div = greatestCommonDenominator(Math.abs(numerator),denominator);
        return new Fraction(numerator /= div, denominator /= div);
    }
}