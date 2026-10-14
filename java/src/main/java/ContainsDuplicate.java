import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean nSquaredAlgorithm(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j= i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    // Duplicate value found.
                    return true;
                }
            }
        }

        // No duplicate value found.
        return false;
    }

    public boolean nAlgorithm(int[] nums) {
        Set<Integer> seenNums = new HashSet<>();

        for (int num : nums) {
            if (seenNums.contains(num)) {
                // Duplicate value found.
                return true;
            }

            seenNums.add(num);
        }

        // No duplicate value found.
        return false;
    }
}
