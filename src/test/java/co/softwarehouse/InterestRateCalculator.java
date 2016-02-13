package co.softwarehouse;

/**
 * Created by hemant joshi on 12/07/2015.
 * Agile Framework Team
 */
public class InterestRateCalculator {

    public static void main(String[] args) {
        double initialAmount =10000;
        double interestRate = 2.2/100.00;
        double year = 10;



        double finalAmount = initialAmount * Math.pow(1.0 + interestRate, year);
        System.out.println("final amount "+ finalAmount);

        System.out.println("For " + year + " years an initial " + initialAmount +
                " cost compounded at a rate of " + interestRate + " will grow to " +
                (initialAmount * Math.pow(1.0 + interestRate, year)));
    }

}
