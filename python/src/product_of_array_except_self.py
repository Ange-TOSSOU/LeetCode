class ProductOfArrayExceptSelf:
    def n_squared_algorithm(self, nums: list[int]) -> list[int]:
        answer: list[int] = []

        for i in range(len(nums)):
            product: int = 1
            for j in range(len(nums)):
                if i != j:
                    product *= nums[j]

            answer.append(product)

        return answer

    def n_algorithm(self, nums: list[int]) -> list[int]:
        answer: list[int] = [1] * len(nums)

        # Note : answer[i] = (products for 0 to i - 1) * (products for i + 1 to nums.length - 1)
        # If i - 1 or i + 1 out of bound, the products are 1.

        product_at_left = 1
        for i in range(len(nums)):
            answer[i] = product_at_left
            product_at_left *= nums[i]

        product_at_right = 1
        for i in range(len(nums) - 1, -1, -1):
            answer[i] *= product_at_right
            product_at_right *= nums[i]

        return answer
