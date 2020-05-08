package day34_CustomClass;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calCost(){
        double total = (width+length)* unitPrice;
        if(isPersian){
            return total+200;
        }else{
            return total;
        }
        //return (isPersian)? total+200: total;
    }

    public void customOrder(double CarpetWidth, double carpetLength, double carpetUnitPrice, boolean carpetPersian){
        width = CarpetWidth;
        length = carpetLength;
        unitPrice = carpetUnitPrice;
        isPersian = carpetPersian;

    }

    public String toString(){
        return "Width: "+width+
                "\nLength: "+length+
                "\nUnit price: $"+unitPrice+
                "\nTotal costs: $"+calCost();
    }
}
