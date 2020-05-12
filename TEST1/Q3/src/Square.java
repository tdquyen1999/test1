/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Square {

    private float lengthOfSqare;

    public Square() {
    }

    public Square(float lengthOfSqare) {
        this.lengthOfSqare = lengthOfSqare;
    }

    public float getLengthOfSqare() {
        return lengthOfSqare;
    }

    public void setLengthOfSqare(float lengthOfSqare) {
        this.lengthOfSqare = lengthOfSqare;
    }

    public void displayLengthOfSquare() {
        System.out.println("Edge Length of Square: " + getLengthOfSqare());
    }

    public void displayPerimeterOfSquare() {
        System.out.println("Perimeter of Square: " + (getLengthOfSqare() * 4));
    }

    public void displayAcreageOfSquare() {
        float areage = (float) Math.pow(getLengthOfSqare(), 2);
        areage = (float) (Math.round(areage * 100.0) / 100.0);
        System.out.println("Acreage of Square: " + areage);
    }

    public void display() {
        displayLengthOfSquare();
        displayPerimeterOfSquare();
        displayAcreageOfSquare();
    }
}
