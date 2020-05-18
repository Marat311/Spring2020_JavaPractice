package day37_Constructors;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CybertekStudents {

    static String schoolName = "Cybertek University";
    String studentName;
    int groupNumber;
    String batch;

    public CybertekStudents(String studentName, int groupNumber, String batch){
       // schoolName = "Cybertek University";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;

    }

    public String toString(){
        return "Name "+studentName+", Batch "+batch+", in group "+groupNumber+", school name: "+schoolName;
    }
}

class CObjects {
    public static void main(String[] args) {



        CybertekStudents student1 = new CybertekStudents("Marina", 3, "Batch 18");
        student1.schoolName = "MIT";
        System.out.println(student1);
        CybertekStudents student2 = new CybertekStudents("Zuura", 7, "Batch 18");
        System.out.println(student2);
        //CybertekStudents student3 = new CybertekStudents();
    }
}