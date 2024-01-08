public class SalesPerson  extends Employee {
    private int salesTarget;

    public SalesPerson (String name, String department, double salary, int salesTarget) {
        super(name, department, salary);
        this.salesTarget = salesTarget;

    }
    @Override
    public String toString() {
        return super.toString() + ",sales Target " + salesTarget;
    }
    
}
