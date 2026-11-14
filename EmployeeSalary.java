import java.util.Scanner;


interface Gross {

    void calculateGross();
}
class Employee {

    int emp_no;
    String name;
    String department;
    double basic_pay;

    void getData() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        emp_no = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.print("Enter Basic Pay: ");
        basic_pay = sc.nextDouble();
    }
}

class Salary extends Employee implements Gross {

    double DA;
    double HRA;
    double gross_salary;


    public void calculateGross() {

        DA = basic_pay * 10 / 100;

        HRA = basic_pay * 20 / 100;

        gross_salary = basic_pay + DA + HRA;
    }


    void display() {

        System.out.println("\nEmployee Details");

        System.out.println("Employee Number: " + emp_no);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);

        System.out.println("Basic Pay: Rs. " + basic_pay);
        System.out.println("DA: Rs. " + DA);
        System.out.println("HRA: Rs. " + HRA);

        System.out.println("Gross Salary: Rs. "
                           + gross_salary);
    }
}



public class EmployeeSalary {

    public static void main(String[] args) {

        Salary s = new Salary();
    
        s.getData();

        s.calculateGross();

        s.display();
    }
}