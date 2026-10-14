class ContainsDuplicate:
    def n_squared_algorithm(self, nums: list[int]) -> bool:
        nums_len = len(nums)
        for i in range(nums_len):
            for j in range(i + 1, nums_len):
                if nums[i] == nums[j]:
                    # Duplicate value found.
                    return True

        # No duplicate value found.
        return False

    def n_algorithm(self, nums: list[int]) -> bool:
        seen_nums: set[int] = set()

        for num in nums:
            if num in seen_nums:
                # Duplicate value found.
                return True

            seen_nums.add(num)

        # No duplicate value found.
        return False
