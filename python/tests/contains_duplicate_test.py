# pip install pytest
import pytest

from src.contains_duplicate import ContainsDuplicate

# --- Utils ---

test_data = [
    ([1, 2, 3, 1], True),
    ([1, 2, 3, 4], False),
    ([1, 1, 1, 3, 3, 4, 3, 2, 4, 2], True),
    ([6], False),
    ([3, 2, 1, 1], True),
    ([2, 1, 1, 3], True),
    ([2, 1, -1, 3], False),
    ([-3, 1, -3, 3], True),
    ([1, 1, 1, 1], True),
]


# --- N Squared Time Complexity ---


@pytest.mark.parametrize("nums, expected", test_data)
def test_n_squared_algorithm(nums: list[int], expected: bool):
    object = ContainsDuplicate()
    result = object.n_squared_algorithm(nums)
    assert result == expected


# --- N Time Complexity ---


@pytest.mark.parametrize("nums, expected", test_data)
def test_n_algorithm(nums: list[int], expected: bool):
    object = ContainsDuplicate()
    result = object.n_algorithm(nums)
    assert result == expected
