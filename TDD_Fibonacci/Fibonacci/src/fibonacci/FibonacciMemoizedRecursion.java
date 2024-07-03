package fibonacci;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoizedRecursion extends FibonacciSimpleRecursion {
  private Map<Integer, BigInteger> cache = new HashMap<>();

  @Override
  public BigInteger fibonacciAtPosition(int position) {
    if (!cache.containsKey(position)) {
      cache.put(position, super.fibonacciAtPosition(position));
    }

    return cache.get(position);
  }
}