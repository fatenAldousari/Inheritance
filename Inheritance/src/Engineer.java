import java.util.Arrays;

public class Engineer extends Employee {
    private String[] skills;

    public String[] getsills() {
        return skills;
    }

    public void setskills(String[] skills) {
        this.skills = skills;
    }

    public Engineer(String name, String department, double salary, String[] skills) {
        super(name, department, salary);
        this.skills = skills;
    }

    @Override
    public String toString() {
        return super.toString() + ", Skill " + Arrays.toString(skills);
    }
}

// // public Engineer(String name, String department, double salary, String[]
// engineerSkill) {
// super(name, department, salary);
// setengineerSkill(EngineerSkill);

// }

// public String [] getengineerSkill(){
// return EngineerSkill;
// }

// public void setengineerSkill(String[]EngineerSkill){
// this.EngineerSkill = EngineerSkill;
// }

// @Override
// public String toString() {
// return super.toString() + ", Skill " + engineerSkill ;
// }

// }
