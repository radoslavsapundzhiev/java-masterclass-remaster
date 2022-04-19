import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myMobilePhone = new MobilePhone();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        //TO DO
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myMobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }




//        MobilePhone myMobilePhone = new MobilePhone();
//        myMobilePhone.addContact("Pesho", "123456");
//        myMobilePhone.addContact("Pesho", "123456789");
//        myMobilePhone.addContact("Gosho", "526347");
//        myMobilePhone.addContact("Tosho", "852648");

//        myMobilePhone.printContacts();

//        myMobilePhone.modifyContact("Pesho", "Pesho", "654321");
//
//        myMobilePhone.printContacts();
//
//        myMobilePhone.searchContact("Gosho");
//
//        myMobilePhone.searchContact("Goshoo");
//
//        myMobilePhone.removeContact("Goshoo");
//
//        myMobilePhone.removeContact("Gosho");
//
//        myMobilePhone.printContacts();
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the contact list.");
        System.out.println("\t 3 - To modify a contact in the contact list.");
        System.out.println("\t 4 - To remove a contact from the contact list.");
        System.out.println("\t 5 - To search for a contact in the contact list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        myMobilePhone.addContact(name, phoneNumber);
    }

    public static void modifyContact() {
        System.out.println("Enter current name: ");
        String currentName = scanner.nextLine();
        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        myMobilePhone.modifyContact(currentName,newName, newPhoneNumber);
    }

    public static void removeContact() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        myMobilePhone.removeContact(name);
    }

    public static void searchForContact() {
        System.out.println("Enter name to search for: ");
        String searchName = scanner.nextLine();
        if(myMobilePhone.searchContact(searchName)) {
            System.out.println("Contact with name: " + searchName + " has been found.");
        } else {
            System.out.println("Contact with name: " + searchName + " not found.");
        }
    }
}
