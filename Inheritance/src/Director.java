public class Director extends Employee {
    private double budget;
    
    public Director(String name, String department, double salary, String university) {
        super(name, department, salary);
        this.budget = 400.0;
    }
   
    @Override
    public String toString() {
        return super.toString() + ", budget; " + budget ;
    }
    }
    

