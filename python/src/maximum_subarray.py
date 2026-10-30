class MaximumSubarray:
    def n_squared_algorithm(self, nums: list[int]) -> int:
        largest_sum: int = nums[0]

        # Compute the sum for each contiguous subarray.
        for i in range(len(nums)):
            current_sum: int = 0
            for j in range(i, len(nums)):
                current_sum += nums[j]

                # Update largestSum if needed.
                if current_sum > largest_sum:
                    largest_sum = current_sum

        return largest_sum

    def n_algorithm(self, nums: list[int]) -> int:
        current_sum: int = nums[0]
        largest_sum: int = nums[0]

        for num in nums[1:]:
            if current_sum < 0 and num > current_sum:
                # currentSum give any benefit to the sum.
                current_sum = num
            else:
                current_sum += num

            # Update largestSum if needed.
            if current_sum > largest_sum:
                largest_sum = current_sum

        return largest_sum
