package fibonacci;

import java.math.BigInteger;

public class FibonacciSimpleRecursion implements Fibonacci {
  @Override
  public BigInteger fibonacciAtPosition(int position) {
    return position == 0 || position == 1 ? BigInteger.ONE :
      fibonacciAtPosition(position - 1).add(fibonacciAtPosition(position - 2));
  }
}
