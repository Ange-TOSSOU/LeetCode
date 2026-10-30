public class MaximumSubarray {

    public int nSquaredAlgorithm(int[] nums) {
        int currentSum, largestSum = nums[0];

        // Compute the sum for each contiguous subarray.
        for (int i = 0; i < nums.length; i++) {
            currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];

                // Update largestSum if needed.
                if (currentSum > largestSum) {
                    largestSum = currentSum;
                }
            }
        }

        return largestSum;
    }

    public int nAlgorithm(int[] nums) {
        int currentSum = nums[0], largestSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0 && nums[i] > currentSum) {
                // currentSum give any benefit to the sum.
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
            }

            // Update largestSum if needed.
            if (currentSum > largestSum) {
                largestSum = currentSum;
            }
        }

        return largestSum;
    }
}
