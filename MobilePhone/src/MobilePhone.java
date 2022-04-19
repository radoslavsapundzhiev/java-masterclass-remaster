import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        int position = findContact(contact.getName());
        if(position >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        int newPosition = findContact(newContact);
        if(position < 0) {
            return false;
        } else if(newPosition >= 0){
            return false;
        }
        myContacts.set(position, newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if (position < 0){
            return false;
        }
        myContacts.remove(contact);
        return true;
    }

    public Contact queryContact(String searchName){
        int position = findContact(searchName);
        if(position >= 0){
            return myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " +
                    myContacts.get(i).getPhoneNumber());
        }
    }
}
