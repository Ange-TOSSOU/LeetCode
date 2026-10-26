public class ProductOfArrayExceptSelf {

    public int[] nSquaredAlgorithm(int[] nums) {
        int[] answer = new int[nums.length];

        int product;
        for (int i = 0; i < nums.length; i++) {
            product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) product *= nums[j];
            }

            answer[i] = product;
        }

        return answer;
    }

    public int[] nAlgorithm(int[] nums) {
        int[] answer = new int[nums.length];

        // Note : answer[i] = (products for 0 to i - 1) * (products for i + 1 to nums.length - 1)
        // If i - 1 or i + 1 out of bound, the products are 1.

        int productAtLeft = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = productAtLeft;
            productAtLeft *= nums[i];
        }

        int productAtRight = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= productAtRight;
            productAtRight *= nums[i];
        }

        return answer;
    }
}
