package fractions;

import com.sun.istack.internal.NotNull;

public interface IFraction {

    /**
     * @return the upper part of the fraction
     */
    @NotNull
    Integer getNumerator();

    /**
     * @return the bottom part of the fraction
     */
    @NotNull
    Integer getDenominator();

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @NotNull
    IFraction plus(@NotNull IFraction other);

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @NotNull
    IFraction minus(@NotNull IFraction other);

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @NotNull
    IFraction times(@NotNull IFraction other);

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    @NotNull
    IFraction dividedBy(@NotNull IFraction other);
}