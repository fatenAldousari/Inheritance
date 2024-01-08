public class Main {
    public static void main(String[] args) {
        final String engineerSkill[] = {};
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");
        Director faten = new Director("faten", " IT", 2000, " KCST");
        SalesPerson noura = new SalesPerson("noura", " sales", 100, 1);
        Engineer fatten = new Engineer("fatten", "hr", 100, engineerSkill);
        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
        System.out.println(faten);
        System.out.println(noura);
        System.out.println(fatten);
    }
}
