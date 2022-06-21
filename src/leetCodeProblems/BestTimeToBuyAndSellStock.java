package leetCodeProblems;

/*
 You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a 
different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. 
If you cannot achieve any profit, return 0.
 */

public class BestTimeToBuyAndSellStock {
	
	public static void main(String[] args) {
		
		int[] prices = new int[]{7,1,5,3,6,4};
		
		maxProfit(prices);
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
		
		int min_val = Integer.MAX_VALUE; // initializing min_val to maximum int value 
		int max_profit = 0; // initializing max_profit to 0
		
		for (int i = 0; i < prices.length; i++) {
			if(prices[i] < min_val) {
				min_val = prices[i];
			}else if (prices[i] - min_val > max_profit) {
				max_profit = prices[i] - min_val;
			}
		}
		return max_profit;
		
		
	}
	
}
