public class Person {
    private String firstName;
    private String lastName;
    private int id;

    public Person(){
        firstName = null;
        lastName = null;
        id = 0;
    }

    public Person(String first, String last, int identity){
        firstName = first;
        lastName = last;
        id = identity;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getId(){
        return id;
    }

    public void printFirstName(){
        System.out.println(getFirstName());
    }

    public void printLastName(){
        System.out.println(getLastName());
    }

    public void printId(){
        System.out.println(getId());
    }

    public String toString(){
        return getFirstName() + " " + getLastName() + " " + getId();
    }

    public void printData(){
        System.out.println(toString());
    }
}
