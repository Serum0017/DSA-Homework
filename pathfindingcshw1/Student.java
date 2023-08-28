import java.util.ArrayList;

public class Student extends Person {
    ArrayList<String> classesTaken = new ArrayList<String>();
    ArrayList<String> grades = new ArrayList<String>();

    Student(String first, String last, int identity, ArrayList<String> cltaken, ArrayList<String> grds){
        super(first, last, identity);
        classesTaken = cltaken;
        grades = grds;
    }

    public void printData(){
        System.out.println("Classes taken: ");
        for(int i = 0; i < classesTaken.size(); i++){
            System.out.println(classesTaken.get(i));
            System.out.print("Grade: ");
            System.out.println(grades.get(i));
        }
    }
}
