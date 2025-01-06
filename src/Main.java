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