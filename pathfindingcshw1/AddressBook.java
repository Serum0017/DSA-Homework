import java.util.ArrayList;

public class AddressBook<P extends Person> {
    ArrayList<P> book = new ArrayList<P>();
    // AddressBook(ArrayList<P> book){
    //     this.book = book;
    // }
    public void addPerson(P person){
        if(findPerson(person).size() > 0){
            return;
        }
        book.add(person);
    }

    public void deletePerson(P person){
        ArrayList<Integer> found = findPerson(person);
        if(found.size() == 0){
            return;
        }
        int firstFound = found.get(0);
        book.remove(firstFound);
    }

    public ArrayList<Integer> findPerson(P person){
        ArrayList<Integer> found = new ArrayList<Integer>();
        for(int i = 0; i < book.size(); i++){
            if(book.get(i).getFirstName() == person.getFirstName()){
                found.add(i);
            }
        }
        return found;
    }
}
