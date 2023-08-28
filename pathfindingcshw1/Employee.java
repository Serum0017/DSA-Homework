public abstract class Employee extends Person {
    private String department;

    public Employee(String first, String last, int identity, String dept){
        super(first, last, identity);
        department = dept;
    }

    public void setDepartment(String dep) {
        department = dep;
    }

    public String getDepartment() {
        return department;
    }
}
