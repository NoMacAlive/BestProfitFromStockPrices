import java.util.*;
import java.util.stream.Collectors;

/**
        * A class that can compute the max profit with one purchase and one sale of one stock from an array of int representing the stock prices in minutes past the trade opening
        * hour which was 10:00am local time.
        * So if the stock cost $5 at 11:00am, stock_prices_yesterday[60] = 5.
        * @author: Guangya Zhu 2021/April/09
*/
public class ProfitCalculator {

    public int getMaxProfit(int[] stockPrices) {
        int maxProfit = 0;
        if (stockPrices.length == 0) {
            return maxProfit;
        }
        List<Integer> maximumProfits = new ArrayList<Integer>();

        //convert the input array into a list to use the fast Collections.max method
        List<Integer> prices = Arrays.stream(stockPrices).boxed().collect(Collectors.toList());

        for( int i = 0; i < prices.size()-2; i++ ) {
            //input stock price can not be negative
            if (prices.get(i) < 0) {
                throw new RuntimeException("Input should be non-negative integers");
            }
            //the max price of the rest of the list minus the current pointed stock price equals the max profit
            int maxPrice = Collections.max(prices.subList(i+1, prices.size() - 1));
            int localMaxProfit = maxPrice - prices.get(i);
            maximumProfits.add(localMaxProfit);
        }
        //max is negative means there is no profit for any purchase and sell
        maxProfit = Collections.max(maximumProfits) < 0 ? 0 : Collections.max(maximumProfits);
        return maxProfit;
    }
}
