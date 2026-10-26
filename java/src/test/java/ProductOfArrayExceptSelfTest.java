import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ProductOfArrayExceptSelfTest {

    /* --- Utils --- */

    static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4}, new int[]{24, 12, 8, 6}),
                arguments(new int[]{-1, 1, 0, -3, 3}, new int[]{0, 0, 9, 0, 0}),
                arguments(new int[]{3, 5}, new int[]{5, 3})
        );
    }

    boolean arraysContainSameData(int[] a, int[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }


    /* --- N Squared Time Complexity --- */

    @ParameterizedTest
    @MethodSource("testData")
    void testNSquaredAlgorithm(int[] nums, int[] expected) {
        ProductOfArrayExceptSelf object = new ProductOfArrayExceptSelf();
        int[] answer = object.nSquaredAlgorithm(nums);
        assertTrue(arraysContainSameData(expected, answer));
    }


    /* --- N Time Complexity --- */

    @ParameterizedTest
    @MethodSource("testData")
    void testNAlgorithm(int[] nums, int[] expected) {
        ProductOfArrayExceptSelf object = new ProductOfArrayExceptSelf();
        int[] answer = object.nAlgorithm(nums);
        assertTrue(arraysContainSameData(expected, answer));
    }
}