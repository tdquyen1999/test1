
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Validation validation = new Validation();
        ArrayList<New> lstOfNew = new ArrayList<New>();
        while (true) {
            menuOfOption();
            int selectedOption = validation.getValidOption();
            switch (selectedOption) {
                case 1:
                    New news = new New();
                    int id = 0;
                    if (lstOfNew.isEmpty()) {
                        id = 1;
                    } else {
                        id = lstOfNew.size() + 1;
                    }
                    String title = validation.getValidString("Enter Title of News: ");
                    String publishDate = validation.getValidDate("Enter PublishDate of News: ");
                    String author = validation.getValidString("Enter Author of News: ");
                    String content = validation.getValidString("Enter Content of News: ");
                    for (int i = 0; i < 3; i++) {
                        int rate = validation.getValidRateOfUser("Enter Rate from 1 to 10: ");
                        news.getRateList().add(rate);
                    }
                    news.setId(id);
                    news.setAuthor(author);
                    news.setTitle(title);
                    news.setPublishDate(publishDate);
                    news.setContent(content);
                    lstOfNew.add(news);
                    break;
                case 2:
                    if (lstOfNew.isEmpty()) {
                        System.out.println("Please Enter At Least 1 News Before Use This Function!");
                        break;
                    } else {
                        for (int i = 0; i < lstOfNew.size(); i++) {
                            New get = lstOfNew.get(i);
                            get.display();
                        }
                        break;
                    }
                case 3:
                    if (lstOfNew.isEmpty()) {
                        System.out.println("Please Enter At Least 1 News Before Use This Function!");
                        break;
                    } else {
                        for (int i = 0; i < lstOfNew.size(); i++) {
                            New get = lstOfNew.get(i);
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

    public static void menuOfOption() {
        System.out.println("Welcome to Our Program: ");
        System.out.println("1 – Insert news");
        System.out.println("2 – View list news");
        System.out.println("3 – Average rate");
        System.out.println("4 – Exit ");
    }
}
