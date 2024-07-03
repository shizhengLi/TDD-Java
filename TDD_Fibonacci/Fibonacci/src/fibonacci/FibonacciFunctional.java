package fibonacci;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.IntStream;

public class FibonacciFunctional implements Fibonacci {
  public BigInteger fibonacciAtPosition(int position) {
    return IntStream.range(0, position)
      .mapToObj(ignore -> List.of(BigInteger.ONE, BigInteger.ONE))
      .reduce(List.of(BigInteger.ONE, BigInteger.ONE), (result, ignore) -> List.of(result.get(1), result.get(0).add(result.get(1))))
      .get(0);
  }
}
