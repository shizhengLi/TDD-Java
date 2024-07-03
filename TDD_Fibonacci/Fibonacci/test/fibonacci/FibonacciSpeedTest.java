package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciSpeedTest {
  long measureRunTime(Fibonacci fibonacci) {
    var startTime = System.currentTimeMillis();
    fibonacci.fibonacciAtPosition(40);
    var endTime = System.currentTimeMillis();

    return endTime - startTime;
  }

  @Test
  void verifyMemoizedRecursionIsTenTimesFasterThanSimpleRecursion() {
    assertTrue(measureRunTime(new FibonacciSimpleRecursion()) > 10 * measureRunTime(new FibonacciMemoizedRecursion()));
  }
}
