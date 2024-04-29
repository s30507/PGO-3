import java.util.ArrayList;

public class Manager extends Employee {
    int danyMiesiac=10;
    static ArrayList<Goal> celeKtoreOsiagnalem = new ArrayList();
    public void addGoals(Goal g){
        if(danyMiesiac==g.miesiac){
            this.celeKtoreOsiagnalem.add(g);
        }
    }

    public Manager(String fname, String lname, String city, String email, String phone, double hireYear){
        super(fname, lname, city, email, phone, hireYear);

    }
}
