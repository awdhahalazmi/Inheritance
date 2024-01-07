package Inheritance;

class Engineers extends Employeee {
    private String[] skills;

    public Engineers(String name, String department, double salary, String[] skills) {
        super(name, department, salary);
        this.skills = skills;
    }

    public void setskillss(String[] skills) {
        this.skills = skills;

    }

    public String[] getskillss() {
        return skills;

    }

    @Override
    public String toString() {
        String skillsString = "";
        for (int i = 0; i < skills.length; i++) {
            skillsString += skills[i];
        }
        return super.toString() + skillsString;
    }
}
