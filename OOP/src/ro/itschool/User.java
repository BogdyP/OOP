package ro.itschool;

public class User {

    public String nume;
    public String prenume;
    public String numeIntreg;
    public int varsta;

    public User(String numeDat, String prenumeDat, int varstaData) {
        nume = numeDat;
        prenume = prenumeDat;
        varsta = varstaData;
        numeIntreg = numeDat + " " + prenumeDat;

    }
}
