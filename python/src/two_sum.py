class TwoSum:
    def n_squared_algorithm(self, nums: list[int], target: int) -> list[int] | None:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    # Solution found.
                    return [i, j]

        # No solution found.
        return None

    def n_algorithm(self, nums: list[int], target: int) -> list[int] | None:
        complements: dict[int, int] = {}

        for i, num in enumerate(nums):
            complementIndex: int | None = complements.get(target - num)

            if complementIndex is not None:
                # Solution found.
                return [complementIndex, i]

            # Keep track of the complement and its index.
            complements[num] = i

        # No solution found.
        return None
