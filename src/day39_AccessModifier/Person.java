package day39_AccessModifier;

public class Person {
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    public Person(String firstname, String lastname,
                  int birthmonth, int birthday, int birthyear, String ssn){
        this.firstname= firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;

    }

public String getFirstname(){
        return firstname;
}

public String getLastname(){
        return lastname;
}

public void  setFirstname(){
        this.firstname= firstname;
}

public void setLastname(){
        this.lastname = lastname;
}

public String getBirthday(int birthmonth, int birthday, int birthyear){
        return "\""+birthmonth+"/"+birthday+"/"+birthyear+"\"";
}
public boolean verifySSN(String ssn){
        if(ssn==this.ssn) {
            return true;
        }else{
            return false;
        }
    }

}
