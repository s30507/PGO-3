public class Employee {
    static double currentYear= 2024;
    static int pensja= 3000;
    static double hireYear;
    public Employee(String fname, String lname, String city, String email, String phone, double hireYear){

        this.hireYear = hireYear;
    }

    public static int calculateSalary(){
        double latazatrudnienia= currentYear - hireYear;
            pensja+= pensja+(1000*latazatrudnienia);
            return pensja;
    }
}

