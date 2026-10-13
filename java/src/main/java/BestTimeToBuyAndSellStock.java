public class BestTimeToBuyAndSellStock {

    public int nSquaredAlgorithm(int[] prices) {
        int maxProfit = 0;

        int profit;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                profit = prices[j] - prices[i];

                // Update the maxProfit if needed.
                if (profit > maxProfit) maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public int nAlgorithm(int[] prices) {
        int maxProfit = 0;

        int minPrice = prices[0], profit;
        for (int price : prices) {
            profit = price - minPrice;

            if (profit > maxProfit) {
                // We made profit, and it's our best so far.
                maxProfit = profit;
            } else if (profit < 0) {
                // No profit made.
                minPrice = price;
            }
        }

        return maxProfit;
    }
}
