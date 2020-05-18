package day37_Constructors;

public class employee {

    String name;
    long id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;

    public void setINfo(String name, long id, long ssn, String jobTitle, double salary, char gender){
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public String toString(){
        return "Name: "+name
                +", id: "+id
                +", SSN: "+ssn
                +", jobTitle: "+jobTitle
                +", salary: " +salary
                +", gender: "+gender;

    }
}
