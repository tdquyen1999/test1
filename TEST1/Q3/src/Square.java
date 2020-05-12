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
    private float length;

    public Square() {
    }

    public Square(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

   
    
    public void displayLength() {
        System.out.println("Edge Length of Square: " + getLength());
    }
    
    public void displayPerimeter() {
        System.out.println("Perimeter of Square: " + (getLength() * 4));
    }
    
    public void displayAcreage() {
        float areage = (float) Math.pow(getLength(), 2);
        areage = (float) (Math.round(areage * 100.0) / 100.0);
        System.out.println("Acreage of Square: " + areage);
    }
    
    public void display() {
        displayLength();
        displayPerimeter();
        displayAcreage();
    }
}
