package day25_MethodsRecap;
/*
1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS
 */
public class Driver {
    /*
    method declaration
     */

    public static void main(String[] args) {
        // getDriver1(); // argument is mandatory
        String str = getDriver1("Cybertek");

        String str2 = getDriver2("cHroMe");

        String str3 = getDriver3("firefox");

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }

    public static String getDriver1 (String browserName){

// switch method
        switch(browserName.toLowerCase()){  // Chrome.toLoverCase ==> chrome
            case "chrome": return "Chrome Driver";

            case "firefox": return  "Firefox Driver";

            case "safary": return  "Safary Driver";

            case "opera": return  "Opera Driver";

            case "edge": return  "Edge Driver";

            default: return  "Invalid Driver";

        }


    }  //switch

    public static String getDriver2 (String browserName){
       // If statement

        browserName = browserName.toLowerCase();  // to ignore case sensitivity
        if(browserName.equals("chrome")){
            return  "Chrome Driver";
        }else if(browserName.equals("Firefox")){
            return  "FireFox Driver";
        }else if(browserName.equals("Opera")) {
            return  "Opera Driver";
        }else if(browserName.equals("Safary")) {
            return  "Safary Driver";
        }else if(browserName.equals("edge")) {
            return  "Edge Driver";
        }else{
            return  "Invalid Driver";
        }


    }  // if statement and return

    public static String getDriver3 (String browserName){
        // ternary method :()?""

        browserName = browserName.toLowerCase();
        return  (browserName.equals("chrome"))? "Chrome Driver":
                (browserName.equals("firefox"))? "FireFox Driver":
                (browserName.equals("safary"))? "Safary Driver":
                (browserName.equals("opera"))? "Opera Driver":
                (browserName.equals("edge"))? "Edge Driver":
                "Invalid Driver";

        }  // ternary

}
