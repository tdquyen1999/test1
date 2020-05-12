
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class New implements INew {

    private int id;
    private String title, publishDate, author, content;
    private float averageRate;
    private Vector<Integer> rateList = new Vector<>(3);

    public New() {
    }

    public New(int id, String title, String publishDate, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public Vector<Integer> getRateList() {
        return rateList;
    }

    public void setRateList(Vector<Integer> rateList) {
        this.rateList = rateList;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void calculate() {
        float sumOfRate = 0;
        for (int i = 0; i < rateList.size(); i++) {
            Integer get = rateList.get(i);
            sumOfRate += get;
        }
        averageRate = (float) (Math.round(sumOfRate / rateList.size() * 100.0) / 100.0);
    }

    @Override
    public void display() {
        String rateOfUser = "";
        for (int i = 0; i < rateList.size(); i++) {
            Integer get = rateList.get(i);
            if (i == rateList.size() - 1) {
                rateOfUser = rateOfUser + Integer.toString(get);
            } else {
                rateOfUser = rateOfUser + Integer.toString(get) + "-";
            }
        }
        System.out.println("Title: " + getTitle() + " - PublishDate: " + getPublishDate() + " - Author: " + getAuthor() + " - Content: " + getContent() + " - Rate from User: " + rateOfUser);
    }

}
