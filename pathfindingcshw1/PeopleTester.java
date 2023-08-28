// tests people and all subclasses

import java.util.ArrayList;

public class PeopleTester {
    public static void main(String[] args){
        // dont judge the names pls
        testPerson(new FullTimeEmployee("Ned", "Smith", 100, "Janitor", 1000000));
        ArrayList<String> classesTaken = new ArrayList<String>();
        classesTaken.add("Java Data Structures and Algorithmns");
        classesTaken.add("Core");
        ArrayList<String> grades = new ArrayList<String>();
        grades.add("A+");
        grades.add("C");
        testPerson(new Student("Joseph", "Ross", 3, classesTaken, grades));
        testPerson(new PartTimeEmployee("Amanda", "Johnson", 81, "CEO", 1, 17));
    }

    public static<P extends Person> void testPerson(P person){
        person.printData();
    }
}
