//package JUnit;
//
//import org.junit.jupiter.api.Test;
//
//class LoanCalculator{
//    public static double [] calculateMonthlyRepaymentSchedule(double loanAmount, double annualInterestRate, int loanTermInMonths){
//        double monthlyInterestRate = annualInterestRate /12.0/100.0;
//        double monthlyPayment = loanAmount * monthlyInterestRate/(1 - Math.pow(1- monthlyInterestRate, -loanTermInMonths));
//
//        double [] repaymentSchedule = new double [loanTermInMonths];
//        double remainingBalance = loanAmount;
//
//        for(int month = 0; month< loanTermInMonths; month ++){
//            double interestPayment = remainingBalance * monthlyInterestRate;
//            double principalPayment = monthlyPayment - interestPayment;
//
//            repaymentSchedule[month] = monthlyPayment;
//            remainingBalance -= principalPayment;
//        }
//        return repaymentSchedule;
//    }
//
//}
//formula for LoanCalculator*******
// Monthly Payment = (P r (1 + r)^n / ((1 + r)^n -1)
//10000 * (5.0/12) * (1+5.0 / 12)^36 / ((1+5.0 / 12)^36 - 1))
//where P is the loan amount (principal),
// r is the monthly interest rate (annual interest rate divided by 12 and convert to a decimal),
// n is the number of months in the loan term

//In this example, the method calculateMonthlyRepaymentSchedule takes three parameters:
// the loan amount, the annual interest rate, and the loan term in months.
// It then calculates the fixed monthly repayment schedule for the loan
// and returns an array of doubles containing the monthly payment for each month.
// The calculateMonthlyRepaymentSchedule method in the LoanCalculator class is responsible for
// calculating the monthly repayment schedule for a given loan amount, annual interest rate,
// and loan term in months. The method uses the formula for calculating the fixed monthly payment
// for a loan, also known as the "Amortization Formula" or "Monthly Installment Formula."

//        The formula for calculating the fixed monthly payment for a loan is:
//        Monthly Payment = (P r (1 + r)^n) / ((1 + r)^n - 1)
//        Where:
//        P is the loan amount (principal),
//        r is the monthly interest rate (annual interest rate divided by 12 and converted
//        to a decimal),
//        n is the number of months in the loan term.

//        The method takes three parameters:
//        loanAmount: The total loan amount that needs to be repaid.
//        annualInterestRate: The annual interest rate for the loan.
//        loanTermInMonths: The total number of months in the loan term.

//        The method then calculates the fixed monthly repayment amount using the formula
//        mentioned above. It iteratively calculates the monthly repayment
//        for each month of the loan term and stores the values in an array.
//        Finally, the method returns an array of doubles containing the monthly repayment amounts
//        for each month of the loan term. The array represents the monthly repayment schedule,
//        where each element corresponds to the fixed monthly payment to be made for each month
//        of the loan.

//        For example, if we have a loan amount of $10,000, an annual interest rate of 5%,
//        and a loan term of 36 months, the calculateMonthlyRepaymentSchedule method
//        will calculate the fixed monthly repayment amounts for 36 months and return
//        an array containing these amounts. These monthly repayment amounts can be used to plan
//        and manage loan payments over time, making it easier for borrowers to understand
//        their financial obligations.

//class MainTest{
//    @Test
//    public void testCalculateMonthlyPaymentScheduleFor10kLoanWith5PercentInterest(){
//// Test case $10,000 loan, 5% interest rate, 3 year loan term
//// Test data - is the data i need to execute the function under test
//// double
//        double loanAmount = 10000;
//        double annualInterestRate = 5.0;
//        int loanTermInMonths = 36;
////10000 * (5.0/12) * (1+5.0 / 12)^36 / ((1+5.0 / 12)^36 - 1)) = 299.71
//        double [] expectedResult = {299.71, 299.71, 299.71, 299.71, 299.71, 299.71, 299.71, 299.71, 299.71, 299.71,
//                299.71, 299.71, 299.71, 299.71, 299.71, 299.71, 299.71, 299.71, 299.71, 299.71,
//                299.71, 299.71, 299.71, 299.71, 299.71, 299.71, 299.71, 299.71, 299.71, 299.71,
//                299.71, 299.71, 299.71, 299.71, 299.71, 299.71, };
//
//        double [] actualResult = LoanCalculator.calculateMonthlyRepaymentSchedule(loanAmount, annualInterestRate, loanTermInMonths);
//
//        assertEquals(expectedResult, actualResult, "10k loan with 5% for 36 month monthly payment miscalculation");
//
//    }
//}