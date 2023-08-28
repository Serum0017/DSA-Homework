public class PersonTester {
    public static void main(String[] args){
        Person person1 = new Person("Magnus", "Carlsen", 3000);
        Person person2 = new Person("Susan", "Polgar", 2577);

        System.out.println("person 1 data: " + person1.getFirstName() + " " + person1.getFullName() + " " + person1.getId());

        System.out.println(person1.toString() + " equals " + person2.toString() + " is ");
        System.out.print(person1 == person2);
    }
}
