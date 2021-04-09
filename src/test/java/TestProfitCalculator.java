import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Provides is a set of test cases to test the ProfitCalculator class.
 *
 * @author Guangya Zhu 2021/April/09
 *
 */

public class TestProfitCalculator{
    /**
     * Test that the getMaxProfit function returns the correct max profit with the example test case
     */
    @Test
    public void test_getMaxProfit_with_Example(){
        int[] stockPrices = {10, 7, 5, 8, 11, 9};
        Assert.assertEquals (6, getMaxProfit(stockPrices)); // returns 6 (buy at $5 sell at $11)
    }

    /**
     * Test that the getMaxProfit function returns 0 when input an empty array
     */
    @Test
    public void test_getMaxProfit_with_Empty_Input(){
        int[] stockPrices = {};
        Assert.assertEquals (0, getMaxProfit(stockPrices)); // returns 6 (buy at $5 sell at $11)
    }


}
