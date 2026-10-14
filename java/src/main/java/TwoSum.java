import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] nSquaredAlgorithm(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // Solution found.
                    return new int[]{i, j};
                }
            }
        }

        // No solution found.
        return new int[]{};
    }

    public int[] nAlgorithm(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        Integer complementIndex;

        for (int i = 0; i < nums.length; i++) {
            complementIndex = complements.get(target - nums[i]);

            if (complementIndex != null) {
                // Solution found.
                return new int[]{complementIndex, i};
            }

            // Keep track of the complement and its index.
            complements.put(nums[i], i);
        }

        // No solution found.
        return new int[]{};
    }
}
