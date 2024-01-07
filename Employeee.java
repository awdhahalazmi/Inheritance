package Inheritance;

public class Employeee {
    private String name;
    private String department;
    private double salary;

    public Employeee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return " " + name + " " + " " + department + " " + salary;
    }

}
