import org.junit.Assert;
import org.junit.Before;
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
    private ProfitCalculator calculator;
    /*
     * A new calculator for every unit tests
     */
    @Before
    public void initializeCaclulator(){
        calculator = new ProfitCalculator();
    }

    /**
     * Test that the getMaxProfit function returns the correct max profit with the example test case
     */
    @Test
    public void test_getMaxProfit_with_Example(){
        int[] stockPrices = {10, 7, 5, 8, 11, 9};
        Assert.assertEquals (6, calculator.getMaxProfit(stockPrices)); // returns 6 (buy at $5 sell at $11)
    }

    /**
     * Test that the getMaxProfit function returns 0 when input an empty array
     */
    @Test
    public void test_getMaxProfit_with_Empty_Input(){
        int[] stockPrices = {};
        Assert.assertEquals (0, calculator.getMaxProfit(stockPrices));
    }

    /**
     * Test that the getMaxProfit function returns 0 when there is no profit in buying and selling
     */
    @Test
    public void test_getMaxProfit_with_Descending_Input(){
        int[] stockPrices = {5, 4, 3, 2, 1};
        Assert.assertEquals (0, calculator.getMaxProfit(stockPrices));
    }


    /**
     * Test that the getMaxProfit function returns 0 when the stock prices are all the same
     */
    @Test
    public void test_getMaxProfit_with_Same_Number_Input(){
        int[] stockPrices = {1, 1, 1, 1, 1, 1};
        Assert.assertEquals (0, calculator.getMaxProfit(stockPrices));
    }

    /**
     * Test that the getMaxProfit function returns 0 with all 0 stock prices
     */
    @Test
    public void test_getMaxProfit_with_All_Zero_Input(){
        int[] stockPrices = {0, 0, 0, 0, 0, 0};
        Assert.assertEquals (0, calculator.getMaxProfit(stockPrices));
    }

    /**
     * Test that the getMaxProfit function returns the correct number with multiple max profit operation
     */
    @Test
    public void test_getMaxProfit_with_Multiple_Max_Profit_Operation(){
        int[] stockPrices = {10, 7, 5, 3, 11, 9};
        Assert.assertEquals (6, calculator.getMaxProfit(stockPrices));
    }

    /**
     * Test that the getMaxProfit function with negative values
     */
    @Test
    public void test_getMaxProfit_with_Negative_Input(){
        int[] stockPrices = {-10, 7, 5, 3, 11, 9};
        try {
            Assert.assertEquals (6, calculator.getMaxProfit(stockPrices));
            fail("Should have failed: negative input");
        } catch (Exception e) {
            // Nothing here - just ignore the fact that the exception
            // occurred (since that's what's supposed to happen in
            // this case).
        }

    }

}
