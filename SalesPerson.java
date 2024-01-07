package Inheritance;

class Salesperson extends Employeee {
    private int salesTarget;

    public Salesperson(String name, String department, double salary, int salesTarget) {
        super(name, department, salary);
        this.salesTarget = salesTarget;
    }

    public void setSalesTarget(int salesTarget) {
        this.salesTarget = salesTarget;

    }

    public double getSalesTarget() {
        return salesTarget;

    }

    @Override
    public String toString() {
        return super.toString() + salesTarget;
    }
}
