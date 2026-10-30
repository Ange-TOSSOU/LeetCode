import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaximumSubarrayTest {

    /* --- Utils --- */

    static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
                arguments(new int[]{1}, 1),
                arguments(new int[]{5, 4, -1, 7, 8}, 23),
                arguments(new int[]{-8, -2, -1, -4, -5}, -1),
                arguments(new int[]{0, 0, 0, 0, 0}, 0),
                arguments(new int[]{0, 0, -1, 0, 0}, 0)
        );
    }


    /* --- N Squared Time Complexity --- */

    @ParameterizedTest
    @MethodSource("testData")
    void testNSquaredAlgorithm(int[] nums, int expected) {
        MaximumSubarray object = new MaximumSubarray();
        assertEquals(expected, object.nSquaredAlgorithm(nums));
    }


    /* --- N Time Complexity --- */

    @ParameterizedTest
    @MethodSource("testData")
    void testNAlgorithm(int[] nums, int expected) {
        MaximumSubarray object = new MaximumSubarray();
        assertEquals(expected, object.nAlgorithm(nums));
    }
}