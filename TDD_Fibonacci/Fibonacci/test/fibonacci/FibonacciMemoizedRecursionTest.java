package fibonacci;

public class FibonacciMemoizedRecursionTest implements FibonacciTest {
  @Override
  public Fibonacci createFibonacci() {
    return new FibonacciMemoizedRecursion();
  }
}
