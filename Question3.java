
import java.util.Scanner;

interface Department {
    String deptName = "Computer Science";
    String deptHead = "Dr. Singh";

    void printDeptName();
    void printDeptHead();
}

class Hostel {
    String hostelName;
    String hostelLocation;
    int numberofRooms;

    void getHostel(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();

        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();

        System.out.print("Enter Number of Rooms: ");
        numberofRooms = sc.nextInt();
        sc.nextLine();
    }

    void printHostel() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberofRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName;
    int regdNo;
    String electiveSubject;
    double avgMarks;

    void getData(Scanner sc) {
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Registration Number: ");
        regdNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();

        System.out.print("Enter Average Marks: ");
        avgMarks = sc.nextDouble();
        sc.nextLine();

        getHostel(sc);
    }

    void printData() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);

        printHostel();
        printDeptName();
        printDeptHead();
    }

    public void printDeptName() {
        System.out.println("Department Name: " + deptName);
    }

    public void printDeptHead() {
        System.out.println("Department Head: " + deptHead);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[50];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Admit New Student");
            System.out.println("2. Migrate a Student");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < 50) {
                        students[count] = new Student();
                        students[count].getData(sc);
                        count++;
                        System.out.println("Student Admitted Successfully");
                    } else {
                        System.out.println("Student Limit Reached");
                    }
                    break;

                case 2:
                    System.out.print("Enter Registration Number: ");
                    int reg = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].regdNo == reg) {
                            System.out.println("Student Found: "
                                    + students[i].studentName);

                            System.out.print("Enter New Hostel Name: ");
                            students[i].hostelName = sc.nextLine();

                            System.out.print("Enter New Hostel Location: ");
                            students[i].hostelLocation = sc.nextLine();

                            System.out.print("Enter Number of Rooms: ");
                            students[i].numberofRooms = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Student Migrated Successfully");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found");
                    }
                    break;

                case 3:
                    System.out.print("Enter Registration Number: ");
                    int search = sc.nextInt();
                    sc.nextLine();

                    boolean exists = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].regdNo == search) {
                            students[i].printData();
                            exists = true;
                            break;
                        }
                    }

                    if (!exists) {
                        System.out.println("Student Not Found");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}

