public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {

        double salary = (daysSkipped >= 5) ? 0.85 : 1.0;

        return salary;
    }

    public int bonusMultiplier(int productsSold) {

        int multiplier = (productsSold >= 20) ? 13 : 10;

        return multiplier;
    }

    public double bonusForProductsSold(int productsSold) {

        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {

        double sumSalary = 1000.00 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);

        double totalSalary = (sumSalary > 2000.00) ? 2000.00 : sumSalary;

        return totalSalary;
    }
}