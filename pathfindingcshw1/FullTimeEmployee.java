public class FullTimeEmployee extends Employee {
    int Salary;

    public FullTimeEmployee(String first, String last, int identity, String dept, int sal){
        super(first, last, identity, dept);
        Salary = sal;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
