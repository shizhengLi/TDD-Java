package fibonacci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

public interface FibonacciTest {
  @Test
  default void Canary() {
    assertTrue(true);
  }

  Fibonacci createFibonacci();

  @Test
  default void verifyFibonacci() {
    var fibonacci = createFibonacci();

    assertAll(
      () -> assertEquals(BigInteger.ONE, fibonacci.fibonacciAtPosition(1)),
      () -> assertEquals(BigInteger.ONE, fibonacci.fibonacciAtPosition(1)),
      () -> assertEquals(BigInteger.valueOf(2), fibonacci.fibonacciAtPosition(2)),
      () -> assertEquals(BigInteger.valueOf(8), fibonacci.fibonacciAtPosition(5)),
      () -> assertEquals(BigInteger.valueOf(89), fibonacci.fibonacciAtPosition(10)),
      () -> assertEquals(BigInteger.valueOf(165580141L), fibonacci.fibonacciAtPosition(40))
    );
  }

  @Test 
  default void verifyFibonacciBigInteger() {
    var fibonacci = createFibonacci();

    assertAll(
      () -> assertEquals(BigInteger.valueOf(20365011074L), fibonacci.fibonacciAtPosition(50)),
      () -> assertEquals(new BigInteger("573147844013817084101"), fibonacci.fibonacciAtPosition(100)),
      () -> assertEquals(new BigInteger("12200160415121876738"), fibonacci.fibonacciAtPosition(92))
    );
  }
}