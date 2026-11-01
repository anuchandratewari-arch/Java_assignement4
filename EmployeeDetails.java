class Employee {

    private String name;
    private String department;
    private double salary;

    static String companyName = "Goodle Pvt. Ltd.";

    
    Employee(String name, String department,
             double salary) {

        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    
    void display() {

        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs. " + salary);

        System.out.println("---------------------------");
    }
}

public class EmployeeDetails {

    public static void main(String[] args) {


        Employee e1 = new Employee(
            "Rahul", "IT", 50000);

        Employee e2 = new Employee(
            "Arun", "HR", 85000);

        Employee e3 = new Employee(
            "Lana", "Finance", 45000);

        Employee e4 = new Employee(
            "Damon", "Marketing", 48000);

        Employee e5 = new Employee(
            "Stefan", "Sales", 50000);

    
        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}