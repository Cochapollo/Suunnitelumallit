package Suunnittelumallit.Tehtävä_10_ChainOfResponsibility;

public class Worker {

    private String name;
    private double salary;
    private double newSalary;

    public Worker(String name, double salary, double newSalary) {
        this.name = name;
        this.salary = salary;
        this.newSalary = newSalary;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public double getNewSalary() { return newSalary; }
    public void setNewSalary(double newSalary) { this.newSalary = newSalary; }
}
