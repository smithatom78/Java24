package module4;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("9475475475");

    public static void main(String[] args) {
        boolean quite = false;
        startPhone();
        printActions();
        while(!quite)
        {
            System.out.println("Show all available actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action)
            {
                case 0:
                {
                    System.out.println("\n Shutting down");
                    quite = true;
                    break;
                }
                case 1:
                {
                    mobilePhone.printContact();
                    break;
                }
                case 2:
                {
                    addNewContact();
                    break;
                }
                case 3:
                {
                    updateContact();
                    break;
                }
                case 4:
                {
                    removeContact();
                    break;
                }
                case 5:
                {
                    queryContact();
                    break;
                }
                case 6:
                {
                    printActions();
                    break;
                }
            }
        }
    }

private static void addNewContact()
{
    System.out.println("Enter new contact name");
    String name = scanner.nextLine();
    System.out.println("Enter the Contact number");
    String phoneNumber = scanner.nextLine();
    Contact newContact = Contact.createContact(name,phoneNumber);
    if(mobilePhone.addNewContact(newContact))
    {
        System.out.println("New Contact added: Name = "+ name+ ",phone number: "+phoneNumber);
    }
    else
    {
        System.out.println("Cannot add , "+name+" already on file");
    }
}
private static void updateContact()
{
    System.out.println("Enter existing contact name: ");
    String name = scanner.nextLine();
    Contact existingContactRecord = mobilePhone.queryContact(name);
    if(existingContactRecord == null)
    {
        System.out.println("Contact not Found");
        return;
    }

    System.out.println("Enter the new Contact name");
    String newName = scanner.nextLine();
    System.out.println("Enter the new Contact phone number");
    String newNumber = scanner.nextLine();
    Contact newContact = Contact.createContact(newName,newNumber);
    if(mobilePhone.updateContact(existingContactRecord, newContact))
    {
        System.out.println("Successfully updated record ");
    }
    else
    {
        System.out.println("Error updating record");
    }
}
private static void removeContact()
{
    System.out.println("Enter the Contact name");
    String name = scanner.nextLine();
    Contact existingContactRecord = mobilePhone.queryContact(name);
    if(existingContactRecord == null)
    {
        System.out.println("Contact not found");
        return;
    }
    if(mobilePhone.removeContact(existingContactRecord))
    {
        System.out.println("Successfully deleted");
    }
    else
    {
        System.out.println("Error deleting Contact");
    }
}
private static void queryContact()
{
    System.out.println("Enter existing contact name :");
    String name= scanner.nextLine();
    Contact existingContactRecord = mobilePhone.queryContact(name);
    if(existingContactRecord == null)
    {
        System.out.println("Contact not found");
        return;
    }
    System.out.println("Name: "+existingContactRecord.getName()+" phoneNumber is "+existingContactRecord.getPhoneNumber());

}
private static void startPhone()
{
    System.out.println("Starting Phone.......");
}
private static void printActions()
{
    System.out.println("\nAvailable actions:\npress");
    System.out.println("0  - to shutdown\n" +
            "1  - to print contacts\n" +
            "2  - to add a new contact\n" +
            "3  - to update an existing contact\n" +
            "4  - to remove an existing contact\n" +
            "5  - query if an existing contact exists\n" +
            "6  - to print a list of available actions.");
    System.out.println("Choose your action: ");
}
}
