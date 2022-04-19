import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        int position = findContact(name);
        if (position < 0) {
            this.contacts.add(contact);
            System.out.println("Contact with name: " + name + " and phoneNumber: " + phoneNumber +
                    " has been added successfully to your contact list.");
        } else {
            System.out.println("Contact with name " + name + " already exists. Please try again.");
        }

    }

    public void modifyContact(String currentName, String newName, String newPhoneNumber) {
        int position = findContact(currentName);
        if(position >= 0){
            modifyContact(position, newName, newPhoneNumber);
        }
    }

    private void modifyContact(int position, String newName, String newPhoneNumber) {
        Contact contact = contacts.get(position);
        contact.setName(newName);
        contact.setPhoneNumber(newPhoneNumber);
        System.out.println("Contact with name: " + contact.getName() + " has been modified.");
    }

    private int findContact(String searchName){
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getName().equals(searchName)) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("You have " + contacts.size() + " contacts in your contact list.");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i+1) + ". " + contacts.get(i).getName() + ": " + contacts.get(i).getPhoneNumber());
        }
    }

    public void removeContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            removeContact(position);
        }
    }

    private void removeContact(int position) {
        contacts.remove(position);
    }

    public boolean searchContact(String searchName) {
        int position = findContact(searchName);
        if(position >= 0) {
            return true;
        }
        return false;
    }
}
