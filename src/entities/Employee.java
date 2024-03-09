package entities;

public class Employee {
    public String name;
    public float salary;
    public float tax;

    public Employee(String name, float salary, float tax) {
        this.name = name;
        this.salary = salary;
        this.tax = tax;
    }

    public Employee() {
    }

    public float netSalary() {
        return salary - tax;
    }

    public void increaseSalary(float pc) {
        salary += salary * pc / 100;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
