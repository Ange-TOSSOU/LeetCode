# pip install pytest
import pytest

from src.maximum_subarray import MaximumSubarray

# --- Utils ---

test_data = [
    ([-2, 1, -3, 4, -1, 2, 1, -5, 4], 6),
    ([1], 1),
    ([5, 4, -1, 7, 8], 23),
    ([-8, -2, -1, -4, -5], -1),
    ([0, 0, 0, 0, 0], 0),
    ([0, 0, -1, 0, 0], 0),
]


# --- N Squared Time Complexity ---


@pytest.mark.parametrize("nums, expected", test_data)
def test_n_squared_algorithm(nums: list[int], expected: int):
    object = MaximumSubarray()
    result = object.n_squared_algorithm(nums)
    assert result == expected


# --- N Time Complexity ---


@pytest.mark.parametrize("nums, expected", test_data)
def test_n_algorithm(nums: list[int], expected: list[int]):
    object = MaximumSubarray()
    result = object.n_algorithm(nums)
    assert result == expected
