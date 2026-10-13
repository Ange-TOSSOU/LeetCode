import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BestTimeToBuyAndSellStockTest {

    /* --- Utils --- */

    static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new int[]{7, 1, 5, 3, 6, 4}, 5),
                arguments(new int[]{7, 6, 4, 3, 1}, 0),
                arguments(new int[]{7, 7, 7, 7, 7}, 0),
                arguments(new int[]{7, 8, 9, 14, 1}, 7),
                arguments(new int[]{7, 8, 1, 3, 2}, 2),
                arguments(new int[]{7, 8, 1, 2, 2}, 1),
                arguments(new int[]{7}, 0)
        );
    }


    /* --- N Squared Algorithm --- */

    @ParameterizedTest
    @MethodSource("testData")
    void testNSquaredAlgorithm(int[] prices, int expected) {
        BestTimeToBuyAndSellStock object = new BestTimeToBuyAndSellStock();
        assertEquals(expected, object.nSquaredAlgorithm(prices));
    }


    /* --- N Algorithm --- */

    @ParameterizedTest
    @MethodSource("testData")
    void testNAlgorithm(int[] prices, int expected) {
        BestTimeToBuyAndSellStock object = new BestTimeToBuyAndSellStock();
        assertEquals(expected, object.nAlgorithm(prices));
    }
}