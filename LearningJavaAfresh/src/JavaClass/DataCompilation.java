package JavaClass;

import java.util.Scanner;

public class DataCompilation {
	
    private int age, id, salary;
    private String firstName, lastName, course, dep, desig;
    
    Scanner sc = new Scanner(System.in);

    void menu() {
        System.out.println("Take Student as Option 1 and Employee as Option 2.");
        System.out.print("Are you inserting as a Student or Employee (Pick 1 or 2) >>");
        int option = sc.nextInt();

        if (option == 1) {
            new StudentCompilation();
        } else if (option == 2) {
            new EmployeeCompilation();
        } else {
            System.out.println("Invalid option. Please choose 1 or 2.");
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setID(int id) {
        this.id = id;
    }
    public int getID() {
        return id;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getCourse() {
        return course;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
    public String getDep() {
        return dep;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }
    public String getDesig() {
        return desig;
    }

    public void setCommon() {
        System.out.print("Enter your first name>> ");
        setFirstName(sc.next());
        System.out.print("Enter your last name>> ");
        setLastName(sc.next());
        System.out.print("Enter your age>> ");
        setAge(sc.nextInt());
        System.out.print("Enter your ID>> ");
        setID(sc.nextInt());
    }

    public void setStudent() {
        System.out.print("Enter your course>> ");
        setCourse(sc.nextLine());  // ask about this... nextLine and next
    }

    public void setEmployee() {
        System.out.print("Enter your salary>> ");
        setSalary(sc.nextInt());
        System.out.print("Enter department>> ");
        setDep(sc.nextLine());
        System.out.print("Enter designation>> ");
        setDesig(sc.nextLine());
    }
    
    public void displayCommon() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getID());
    }

    public void displayStudent() {
        System.out.println("Course: " + getCourse());
    }

    public void displayEmployee() {
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + getDep());
        System.out.println("Designation: " + getDesig());
    }

    public static void main(String[] args) {
        DataCompilation obj = new DataCompilation();
        obj.menu();
    }
}

class StudentCompilation extends DataCompilation {
    public StudentCompilation() {
        setCommon();
        setStudent();
        displayCommon();
        displayStudent();
    }
}

class EmployeeCompilation extends DataCompilation {
    public EmployeeCompilation() {
        setCommon();
        setEmployee();
        displayCommon();
        displayEmployee();
    }
}
