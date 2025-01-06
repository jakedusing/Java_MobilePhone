# Mobile Phone

 A simple Java application to manage contacts using a mobile phone interface.  This app allows users to add, update, and search for contacts. It also provides a feature to display all stored contacts in a structured manner.

 ## Features
 - Add new contacts with a name and phone number.
 - Update existing contacts with new details.
 - Delete contacts by name.
 - Search for a contact by name to retrieve their details.
 - Display all contacts in the list.

## Technologies Used
- **Language**: Java
- **Data Storage**: ArrayList

## Menu Options
- `0`: Show available actions.
- `1`: Print all contacts.
- `2`: Add a new contact.
- `3`: Update an existing contact.
- `4`: Remove a contact.
- `5`: Search for a contact.
- `6`: Quit the application.

## Example Interaction

```plaintext
Available actions:
0 - Show available actions
1 - Print Contacts
2 - Add a new contact
3 - Update an existing contact
4 - Remove an existing contact
5 - Search for a contact
6 - Quit the application

Choose an action (0 to show available actions): 2
Enter new contact name: John
Enter phone number: 555-6789
New contact added: John, 555-6789

Choose an action (0 to show available actions): 1
Contact List:
1. John -> 555-6789

Choose an action (0 to show available actions): 5
Enter contact name: John
Name: John, Phone number: 555-6789

Choose an action (0 to show available actions): 6
Shutting down...
