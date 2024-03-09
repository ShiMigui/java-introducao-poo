import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Salary: ");
        employee.salary = sc.nextFloat();
        System.out.print("Tax: ");
        employee.tax = sc.nextFloat();

        System.out.println("Employee: " + employee);
        System.out.println();

        System.out.print("Percentage to increase salary: ");
        employee.increaseSalary(sc.nextFloat());
        
        System.out.println("Updated employee: " + employee);
        sc.close();
    }
}
