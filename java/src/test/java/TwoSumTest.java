import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TwoSumTest {

    /* --- Utils --- */

    static Stream<Arguments> arrayIntProvider() {
        return Stream.of(
                arguments(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                arguments(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                arguments(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                arguments(new int[]{2, 7, 11, 2}, 4, new int[]{0, 3}),
                arguments(new int[]{7, 2, 2, 11}, 4, new int[]{1, 2})
        );
    }

    boolean arraysContainSameData(int[] a, int[] b) {
        return (a[0] == b[0] && a[1] == b[1]) || (a[0] == b[1] && a[1] == b[0]);
    }



    /* --- N Squared Time Complexity --- */

    @Test
    void testNSquaredAlgorithmReturnAnEmptyArrayWhenNoSolutionExists() {
        TwoSum object = new TwoSum();

        int[] result = object.nSquaredAlgorithm(new int[]{2, 7, 1, 11, 15}, 10);
        assertEquals(0, result.length);
    }

    @Test
    void testNSquaredAlgorithmReturnDistinctIndices() {
        TwoSum object = new TwoSum();

        int[] result = object.nSquaredAlgorithm(new int[]{2, 7, 11, 15}, 4);
        assertEquals(0, result.length);
    }

    @ParameterizedTest
    @MethodSource("arrayIntProvider")
    void testNSquaredAlgorithmReturnSolutionWhenExists(int[] nums, int target, int[] expected) {
        TwoSum object = new TwoSum();

        int[] result = object.nSquaredAlgorithm(nums, target);
        assertEquals(2, result.length);
        assertTrue(arraysContainSameData(result, expected));
    }



    /* --- N Time Complexity --- */

    @Test
    void testNAlgorithmReturnAnEmptyArrayWhenNoSolutionExists() {
        TwoSum object = new TwoSum();

        int[] result = object.nAlgorithm(new int[]{2, 7, 1, 11, 15}, 10);
        assertEquals(0, result.length);
    }

    @Test
    void testNAlgorithmReturnDistinctIndices() {
        TwoSum object = new TwoSum();

        int[] result = object.nAlgorithm(new int[]{2, 7, 11, 15}, 4);
        assertEquals(0, result.length);
    }

    @ParameterizedTest
    @MethodSource("arrayIntProvider")
    void testNAlgorithmReturnSolutionWhenExists(int[] nums, int target, int[] expected) {
        TwoSum object = new TwoSum();

        int[] result = object.nAlgorithm(nums, target);
        assertEquals(2, result.length);
        assertTrue(arraysContainSameData(result, expected));
    }
}