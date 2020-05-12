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
    public static final double Money_From_0_To_25_kWh = 1000.0;
    public static final double Money_From_25_To_75_kWh = 1250.0;
    public static final double Money_From_75_To_150_kWh = 1800.0;
    public static final double Money_Over_150kWh = 2500.0;
    
    
    
    
    public static void main(String[] args) {
        solve();
    }
    
    public static void solve() {
        Validation v = new Validation();
        System.out.println("Welcome, ");
        double inputkWh = v.validateDouble("Enter Total kWh per Month: ");
        double moneyPay = 0;
        if(inputkWh <= 25) {
            moneyPay = inputkWh * Money_From_0_To_25_kWh;
        } 
        if(inputkWh <= 75) {
            moneyPay = 25 * Money_From_0_To_25_kWh + (inputkWh - 25.0) * Money_From_25_To_75_kWh;
        }
        if(inputkWh <= 150) {
            moneyPay = (25 * Money_From_0_To_25_kWh) + (50 * Money_From_25_To_75_kWh) + (inputkWh - 75) * Money_From_75_To_150_kWh;
        } 
        if(inputkWh > 150) {
            moneyPay = (25 * Money_From_0_To_25_kWh) + (50 * Money_From_25_To_75_kWh) + (75 * Money_From_75_To_150_kWh) + (inputkWh - 150) * Money_Over_150kWh;
        }
        System.out.println("Total Money That You Have to Pay: " + moneyPay);
    }
}
