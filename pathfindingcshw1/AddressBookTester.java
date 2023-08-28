public class AddressBookTester {
    public static void main(String[] args){
        AddressBook<FullTimeEmployee> addr = new AddressBook<FullTimeEmployee>();

        addr.addPerson(new FullTimeEmployee("me", "im too tired to think of more names", 44, "working in the tree in the yard over there", 333));
        addr.addPerson(new FullTimeEmployee("Prayas", "Duragen", 128, "my friend in second grade", 4121));
        System.out.println(addr.findPerson(new FullTimeEmployee("Prayas", "Duragen", 128, "my friend in second grade", 4121)));
        addr.deletePerson(new FullTimeEmployee("Prayas", "Duragen", 128, "my friend in second grade", 4121));
        System.out.println(addr.findPerson(new FullTimeEmployee("Prayas", "Duragen", 128, "my friend in second grade", 4121)));
    }
}
