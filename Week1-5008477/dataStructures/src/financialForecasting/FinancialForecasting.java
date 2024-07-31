package financialForecasting;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: if periods are 0, the future value is the present value
        if (periods == 0) {
            return presentValue;
        }

        // Recursive case: calculate the future value for (periods - 1) and then apply the growth rate
        return calculateFutureValue(presentValue, growthRate, periods - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        FinancialForecasting forecasting = new FinancialForecasting();
        double presentValue = 1000.0; // Initial amount
        double growthRate = 0.05;     // 5% growth rate
        int periods = 10;             // Number of periods (e.g., years)

        double futureValue = forecasting.calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: " + futureValue);
    }
}

