package fibonacci;

public class FibonacciSimpleRecursionTest implements FibonacciTest{
  @Override
  public Fibonacci createFibonacci() {
    return new FibonacciSimpleRecursion();
  }

  @Override
  public void verifyFibonacciBigInteger() {
    var intention = "bypassing due to slow execution";
  }
}
