
import java.util.Scanner;

class Employee {
    int emp_no;
    String name, department;
    double basic_pay, da, hra, gross_salary;

    Employee(int emp_no, String name, String department,
             double basic_pay) {
        this.emp_no = emp_no;
        this.name = name;
        this.department = department;
        this.basic_pay = basic_pay;

        da = basic_pay * 0.10;
        hra = basic_pay * 0.20;
        gross_salary = basic_pay + da + hra;
    }

    void display() {
        System.out.println("Employee No: " + emp_no);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("Gross Salary: " + gross_salary);
    }
}

public class HighestSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee highest = null;

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Employee No: ");
            int emp_no = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Basic Pay: ");
            double basic_pay = sc.nextDouble();
            sc.nextLine();

            Employee emp = new Employee(
                emp_no, name, department, basic_pay
            );

            if (highest == null ||
                emp.gross_salary > highest.gross_salary) {
                highest = emp;
            }
        }

        System.out.println("\n--- Employee with Highest Gross Salary ---");
        if (highest != null) {
            highest.display();
        } else {
            System.out.println("No employees entered.");
        }

        sc.close();
    }
}
