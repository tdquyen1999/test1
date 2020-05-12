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
        Validation validation = new Validation();
        float length = validation.getValidFloatNumber("Enter Length of Square: ");
        Square square = new Square(length);
        square.displayLengthOfSquare();
        square.displayPerimeterOfSquare();
        square.displayAcreageOfSquare();
        square.display();

    }
}
