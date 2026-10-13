# pip install pytest
import pytest

from src.best_time_to_buy_and_sell_stock import BestTimeToBuyAndSellStockTest

# --- Utils ---

test_data = [
    ([7, 1, 5, 3, 6, 4], 5),
    ([7, 6, 4, 3, 1], 0),
    ([7, 7, 7, 7, 7], 0),
    ([7, 8, 9, 14, 1], 7),
    ([7, 8, 1, 3, 2], 2),
    ([7, 8, 1, 2, 2], 1),
    ([7], 0),
]

# --- N Squared Time Complexity ---


@pytest.mark.parametrize("prices, expected", test_data)
def test_n_squared_algorithm(prices: list[int], expected: int):
    object = BestTimeToBuyAndSellStockTest()
    assert object.nSquaredAlgorithm(prices) == expected


# --- N Time Complexity ---


@pytest.mark.parametrize("prices, expected", test_data)
def test_n_algorithm(prices: list[int], expected: int):
    object = BestTimeToBuyAndSellStockTest()
    assert object.nAlgorithm(prices) == expected
