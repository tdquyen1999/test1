

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
    public static void main(String[] args) {
        solve();
    }
    
    public static void solve() {
        Validation v = new Validation();
        System.out.println("Welcome to Quadratic Equation Program, ");
        int a = v.validateInteger("Enter a: ");
        int b = v.validateInteger("Enter b: ");
        int c = v.validateInteger("Enter c: ");
        if(a != 0) {
            double delta = Math.pow(b, 2) - (4 * a * c);
            if(delta < 0) {
                System.out.println("Quadratic Equation Not Have Delta");
            } else {
                System.out.println("Square Root of Delta: " + (Math.round(Math.sqrt(delta) * 100.0) / 100.0 ));
            }
        } else {
            System.out.println("Quadratic Equation Not Have Delta");
        }
    }
    
}


