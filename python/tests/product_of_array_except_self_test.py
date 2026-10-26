# pip install pytest
import pytest

from src.product_of_array_except_self import ProductOfArrayExceptSelf

# --- Utils ---

test_data = [
    ([1, 2, 3, 4], [24, 12, 8, 6]),
    ([-1, 1, 0, -3, 3], [0, 0, 9, 0, 0]),
    ([3, 5], [5, 3]),
]


# --- N Squared Time Complexity ---


@pytest.mark.parametrize("nums, expected", test_data)
def test_n_squared_algorithm(nums: list[int], expected: list[int]):
    object = ProductOfArrayExceptSelf()
    result = object.n_squared_algorithm(nums)
    assert result == expected


# --- N Time Complexity ---


@pytest.mark.parametrize("nums, expected", test_data)
def test_n_algorithm(nums: list[int], expected: list[int]):
    object = ProductOfArrayExceptSelf()
    result = object.n_algorithm(nums)
    assert result == expected
