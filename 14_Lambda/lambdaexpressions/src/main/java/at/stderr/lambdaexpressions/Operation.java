package at.stderr.lambdaexpressions;

@FunctionalInterface
public interface Operation<T> {
    T operate(T a, T b);
}
