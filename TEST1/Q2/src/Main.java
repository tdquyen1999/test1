/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {

    static final double MONEYPAY_PER_1kWh_FROM_0kWh_TO_25kWh = 1000.0;
    static final double MONEYPAY_PER_1kWh_FROM_25kWh_TO_75kWh = 1250.0;
    static final double MONEYPAY_PER_1kWh_FROM_75kWh_TO_150kWh = 1800.0;
    static final double MONEYPAY_PER_1kWh_FROM_150kWh = 2500.0;

    public static void main(String[] args) {
        displayMoneyPayPerMonth();
    }

    public static void displayMoneyPayPerMonth() {
        Validation validation = new Validation();
        System.out.println("Welcome, ");
        double inputkWh = validation.getValidDoubleNumber("Enter Total kWh per Month: ");
        double moneyPay = 0;
        if (inputkWh <= 25) {
            moneyPay = inputkWh * MONEYPAY_PER_1kWh_FROM_0kWh_TO_25kWh;
        } else if (inputkWh <= 75) {
            moneyPay = 25 * MONEYPAY_PER_1kWh_FROM_0kWh_TO_25kWh + (inputkWh - 25.0) * MONEYPAY_PER_1kWh_FROM_25kWh_TO_75kWh;
        } else if (inputkWh <= 150) {
            moneyPay = (25 * MONEYPAY_PER_1kWh_FROM_0kWh_TO_25kWh) + (50 * MONEYPAY_PER_1kWh_FROM_25kWh_TO_75kWh) + (inputkWh - 75) * MONEYPAY_PER_1kWh_FROM_75kWh_TO_150kWh;
        } else if (inputkWh > 150) {
            moneyPay = (25 * MONEYPAY_PER_1kWh_FROM_0kWh_TO_25kWh) + (50 * MONEYPAY_PER_1kWh_FROM_25kWh_TO_75kWh) + (75 * MONEYPAY_PER_1kWh_FROM_75kWh_TO_150kWh) + (inputkWh - 150) * MONEYPAY_PER_1kWh_FROM_150kWh;
        }
        System.out.println("Total Money That You Have to Pay: " + moneyPay);
    }
}
