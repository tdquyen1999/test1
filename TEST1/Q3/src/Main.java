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
        Validation v = new Validation();
        float length = v.validateFloat("Enter Length of Square: ");
        Square s = new Square(length);
        s.displayLength();
        s.displayPerimeter();
        s.displayAcreage();
        System.out.println();
        s.display();
        
    }
}
