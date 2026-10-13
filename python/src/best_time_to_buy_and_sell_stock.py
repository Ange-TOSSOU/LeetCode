class BestTimeToBuyAndSellStockTest:
    def nSquaredAlgorithm(self, prices: list[int]) -> int:
        max_profit: int = 0

        profit: int = 0
        prices_length = len(prices)
        for i in range(prices_length):
            for j in range(i + 1, prices_length):
                profit = prices[j] - prices[i]

                # Update the max_profit if needed.
                max_profit = max(max_profit, profit)

        return max_profit

    def nAlgorithm(self, prices: list[int]) -> int:
        max_profit: int = 0

        min_price: int = prices[0]
        for price in prices:
            profit = price - min_price

            if profit > max_profit:
                # We made profit, and it's our best so far.
                max_profit = profit
            elif profit < 0:
                # No profit made.
                min_price = price

        return max_profit
