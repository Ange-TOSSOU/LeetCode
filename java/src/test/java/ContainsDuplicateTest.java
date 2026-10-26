import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ContainsDuplicateTest {

    static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 1}, true),
                arguments(new int[]{1, 2, 3, 4}, false),
                arguments(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true),
                arguments(new int[]{6}, false),
                arguments(new int[]{3, 2, 1, 1}, true),
                arguments(new int[]{2, 1, 1, 3}, true),
                arguments(new int[]{2, 1, -1, 3}, false),
                arguments(new int[]{-3, 1, -3, 3}, true),
                arguments(new int[]{1, 1, 1, 1}, true)
        );
    }


    /* --- N Squared Time Complexity --- */

    @ParameterizedTest
    @MethodSource("testData")
    public void testNSquaredAlgorithm(int[] nums, boolean expected) {
        ContainsDuplicate object = new ContainsDuplicate();
        assertEquals(expected, object.nSquaredAlgorithm(nums));
    }


    /* --- N Time Complexity --- */

    @ParameterizedTest
    @MethodSource("testData")
    public void testNAlgorithm(int[] nums, boolean expected) {
        ContainsDuplicate object = new ContainsDuplicate();
        assertEquals(expected, object.nAlgorithm(nums));
    }
}