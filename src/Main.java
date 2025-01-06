import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("555-1234");


    public static void main(String[] args) {
        boolean quit = false;
        printActions();
        while (!quit) {
            System.out.println("\nChoose an action (0 to show available actions):");
            int action = scanner.nextInt();
            scanner.nextLine(); // clear newLine character from input buffer

            switch (action) {
                case 0:
                    printActions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Shutting down...");
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name");
        String name = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: " + name + ", " + phoneNumber);
        } else {
            System.out.println("Contact already exists.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name:");
        String oldName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(oldName);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number:");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNumber);
        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Successfully updated contact.");
        } else {
            System.out.println("Error updating contact");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }

        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Successfully deleted contact.");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void searchContact() {
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if (contact == null) {
            System.out.println("Contact not found");
        } else {
            System.out.println("Name: " + contact.getName() + ", Phone number: " + contact.getPhoneNumber());
        }
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:");
        System.out.println("0 - Show available actions");
        System.out.println("1 - Print contacts");
        System.out.println("2 - Add a new contact");
        System.out.println("3 - Update an existing contact");
        System.out.println("4 - Remove an existing contact");
        System.out.println("5 - Search for a contact");
        System.out.println("6 - Quit the application");
    }
}