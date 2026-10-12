# pip install pytest
import pytest

from src.two_sum import TwoSum

# --- Utils ---

test_data = [
    ([2, 7, 11, 15], 9, [0, 1]),
    ([3, 2, 4], 6, [1, 2]),
    ([2, 7, 11, 15], 9, [0, 1]),
    ([2, 7, 11, 2], 4, [0, 3]),
    ([7, 2, 2, 11], 4, [1, 2]),
]


def arrays_contain_same_data(a: list[int] | None, b: list[int] | None) -> bool:
    if a is None or b is None:
        return a == b
    return set(a) == set(b)


# --- N Squared Time Complexity ---


def test_n_squared_algorithm_return_none_when_no_solution_exists():
    object = TwoSum()
    assert object.n_squared_algorithm([2, 7, 1, 11, 15], 10) is None


def test_n_squared_algorithm_return_distinct_indices():
    object = TwoSum()
    assert object.n_squared_algorithm([2, 7, 11, 15], 4) is None


@pytest.mark.parametrize("nums, target, expected", test_data)
def test_n_squared_algorithm_return_solution_when_exists(
    nums: list[int], target: int, expected: list[int]
):
    object = TwoSum()
    result = object.n_squared_algorithm(nums, target)
    assert arrays_contain_same_data(result, expected) == True


# --- N Time Complexity ---


def test_n_algorithm_return_none_when_no_solution_exists():
    object = TwoSum()
    assert object.n_algorithm([2, 7, 1, 11, 15], 10) is None


def test_n_algorithm_return_distinct_indices():
    object = TwoSum()
    assert object.n_algorithm([2, 7, 11, 15], 4) is None


@pytest.mark.parametrize("nums, target, expected", test_data)
def test_n_algorithm_return_solution_when_exists(
    nums: list[int], target: int, expected: list[int]
):
    object = TwoSum()
    result = object.n_algorithm(nums, target)
    assert arrays_contain_same_data(result, expected) == True
