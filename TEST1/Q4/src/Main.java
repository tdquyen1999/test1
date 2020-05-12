
import java.util.ArrayList;

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
        ArrayList<New> lstNew = new ArrayList<New>();
        while (true) {
            menu();
            int option = v.validateOption();
            switch (option) {
                case 1:
                    New n = new New();
                    int id = 0;
                    if(lstNew.isEmpty()) {
                        id = 1;
                    } else {
                        id = lstNew.size() + 1;
                    }
                    String title = v.validateString("Enter Title of News: ");
                    String publishDate = v.validateDate("Enter PublishDate of News: ");
                    String author = v.validateString("Enter Author of News: ");
                    String content = v.validateString("Enter Content of News: ");
                    for (int i = 0; i < 3; i++) {
                        int rate = v.validateRate("Enter Rate from 1 to 10: ");
                        n.getRateList().add(rate);
                    }
                    n.setId(id);
                    n.setAuthor(author);
                    n.setTitle(title);
                    n.setPublishDate(publishDate);
                    n.setContent(content);
                    lstNew.add(n);
                    break;
                case 2:
                    if (lstNew.isEmpty()) {
                        System.out.println("Please Enter At Least 1 News Before Use This Function!");
                        break;
                    } else {
                        for (int i = 0; i < lstNew.size(); i++) {
                            New get = lstNew.get(i);
                            get.display();
                        }
                        break;
                    }
                case 3:
                    if (lstNew.isEmpty()) {
                        System.out.println("Please Enter At Least 1 News Before Use This Function!");
                        break;
                    } else {
                        for (int i = 0; i < lstNew.size(); i++) {
                            New get = lstNew.get(i);
                            get.display();
                            get.calculate();
                            System.out.print(" - AverageRate: " + get.getAverageRate() + "\n");
                        }
                        break;
                    }
                case 4:
                    System.out.println("Thank for using!");
                    return;
            }
        }
    }

    public static void menu() {
        System.out.println("Welcome to Our Program: ");
        System.out.println("1 – Insert news");
        System.out.println("2 – View list news");
        System.out.println("3 – Average rate");
        System.out.println("4 – Exit ");
    }
}
