package Inheritance;

class Director extends Employeee {
    private int teamSize;
    private double budget;

    public Director(String name, String department, double salary, int teamSize, double budget) {
        super(name, department, salary);
        this.teamSize = teamSize;
        this.budget = budget;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void setBudget(double budget) {
        this.budget = budget;

    }

    public double getBudget() {
        return budget;

    }

    @Override
    public String toString() {
        return super.toString() + budget;
    }
}
