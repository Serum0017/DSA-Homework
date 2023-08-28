public class PartTimeEmployee extends Employee {
    private float hourlyRate;
    private float hoursWorkedPerWeek;

    public PartTimeEmployee(String first, String last, int identity, String dept, float hourlyRate, float hoursWorkedPWeek){
        super(first, last, identity, dept);
        this.hourlyRate = hourlyRate;
        hoursWorkedPerWeek = hoursWorkedPWeek;
    }

    public void printData(){
        System.out.println("total hours: " + (hoursWorkedPerWeek * 4.0));
        System.out.println("average hours per week:" + hoursWorkedPerWeek);
        System.out.println("total wages: " + (hoursWorkedPerWeek * 4.0 * hourlyRate));
    }
}
