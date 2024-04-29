import java.util.ArrayList;

public class Tester extends Employee{
    static ArrayList<String> TestyKtoreWykonalem = new ArrayList();
    String nazwaTestu;
    double premia= 300;

    public void addTestType(String TestKtoryWykonalem ){

        this.TestyKtoreWykonalem.add(TestKtoryWykonalem);
    }
    public Tester(String fname, String lname, String city, String email, String phone, double hireYear){
        super(fname, lname, city, email, phone, hireYear);

    }
}
