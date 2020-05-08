package day35_Static;

public class Offer {
    /*Create a class called Offer that has:
    instance fields :
            location, company, salary , isFullTime
    instance methods :
        setOfferInfo: can set the location, company, salary , isFullTime of the offer
        toString -- print all info about offers
    create a class called MyOffers
        Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer

     */

    String location;
    String company;
    double salary;
    boolean isFullTime;

    public void setInfo(String location, String company, double salary, boolean isFullTime){

        this.company=company;
        this.location=location;
        this.salary=salary;
        this.isFullTime=isFullTime;

    }

    public String toString(){
        return "Location: "+location+", Company: "+company+", Salary: $"+salary+", FullTime: "+isFullTime;

    }




}
