package Solid.OpenClosePrinciple.BetterFilter;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
