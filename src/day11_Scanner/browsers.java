package day11_Scanner;

public class browsers {
    /*
    3. write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task
     */
    public static void main(String[] args) {

        String browserName = "firefox";
        switch (browserName){
            case"chrome":  // or logic
            case "Chrome":
                System.out.println("Chrome is opening...");
                break;
            case"firefox":  // or logic
            case "FireFox":
                System.out.println("FireFox is opening ...");
                break;
            case"opera":  // or logic
            case "Opera":
                System.out.println("Opera is opening ...");
                break;
            case"safari":  // or logic
            case "Safari":
                System.out.println("Safari is opening...");
                break;
            default:
                System.out.println("Invalid name");

        }
    }




}



