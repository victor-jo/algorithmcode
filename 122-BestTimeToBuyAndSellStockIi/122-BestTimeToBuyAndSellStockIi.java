// Last updated: 2026. 7. 16. 오전 11:27:58
class Solution {
    public int maxProfit(int[] prices) {
		int profit = 0;

		int velly;
		int peek;

		int index = 0;

		while (index < prices.length-1) {
			while (index < prices.length-1 && prices[index] >= prices[index+1]) {
				++index;
			}
			velly = prices[index];
			while (index < prices.length-1 && prices[index] <= prices[index+1]) {
				++index;
			}
			peek = prices[index];
			profit += peek - velly;
		}

		return profit;
	}
}