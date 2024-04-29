import java.util.ArrayList;

public class Developer extends Employee {
  static ArrayList<Technology>  technologiektoreznam = new ArrayList();
    public void addTechnology(Technology t){
        this.technologiektoreznam.add(t);
    }

    public Developer(String fname, String lname, String city, String email, String phone, double hireYear){
        super(fname, lname, city, email, phone, hireYear);

    }
}
