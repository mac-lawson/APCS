import java.util.Arrays;
/**
 * Tester class for Contact.java
 *
 * @author Mac Lawson
 * @version 2/07/23
 */
public class ContactTester {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[10];
        
        contacts[0] = new Contact("Jane Doe", "Friend", "Jan 1, 1980", "555-555-5555", "janedoe@email.com");
        contacts[1] = new Contact("Jane Doe", "Sibling", "Mar 3, 1985", "555-555-5563", "janedoe@email.com");
        contacts[2] = new Contact("Bob Smith", "Colleague", "Apr 4, 1990", "555-555-5557", "bobsmith@email.com");
        contacts[3] = new Contact("Alice Johnson", "Family", "Jan 5, 1995", "555-555-5558", "alicejohnson@email.com");
        contacts[4] = new Contact("Charlie Brown", "Friend", "Jun 7, 2000", "555-555-5559", "charliebrown@email.com");
        contacts[5] = new Contact("David Green", "Family", "Jul 7, 2005", "555-555-5559", "davidgreen@email.com");
        contacts[6] = new Contact("Emily Davis", "Friend", "Jan 8, 1980", "555-555-5561", "emilydavis@email.com");
        contacts[7] = new Contact("Frank Wilson", "Colleague", "Sep 9, 1985", "555-555-5562", "frankwilson@email.com");
        contacts[8] = new Contact("Grace Lee", "Family", "Oct 1, 1990", "555-555-5563", "gracelee@email.com");
        contacts[9] = new Contact("Henry King", "Friend", "Nov 1, 1995", "555-555-5564", "henryking@email.com");
        System.out.println("original array: \n");
        printAll(contacts);
        sortByName(contacts);
        
        int index = binarySearchByName(contacts, "Jane Doe");
        if (index != -1) {
            linearPrintName(contacts, index, "Jane Doe");
        } else {
            System.out.println("Name 'Jane Doe' not found.");
        }
        sortByRelation(contacts);
        
        int index1 = binarySearchByRelation(contacts, "Friend");
        if (index1 != -1) {
            linearPrintRelation(contacts, index1, "Friend");
        } else {
            System.out.println("Relation 'friend' not found.");
        }
        System.out.println("\n\n\n");
        sequentialSearchByBirthday(contacts, "Jan");
        sequentialSearchByPhoneNumber(contacts, "555-555-5563");
        sequentialSearchByEmailAddress(contacts, "janedoe@email.com");
    }

    public static void printAll(Contact[] contacts){
        for (Contact c : contacts) {
            System.out.println(c + "\n");
        }
    }
    public static void sortByName(Contact[] contacts) {
        Arrays.sort(contacts, (a, b) -> a.getName().compareTo(b.getName()));
    }
    
    public static void sortByRelation(Contact[] contacts) {
        Arrays.sort(contacts, (a, b) -> a.getRelation().compareTo(b.getRelation()));
    }

    public static int searchByName(Contact[] contacts, String name) {
        int left = 0;
        int right = contacts.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            int comparisonResult = name.compareTo(contacts[mid].getName());
            
            if (comparisonResult == 0) {
                return mid;
            } else if (comparisonResult < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return -1;
    }
    public static int binarySearchByName(Contact[] contacts, String name) {
        int left = 0;
        int right = contacts.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            int comparisonResult = name.compareTo(contacts[mid].getName());
            
            if (comparisonResult == 0) {
                return mid;
            } else if (comparisonResult < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return -1;
    }
    
    public static void linearPrintName(Contact[] contacts, int index, String name) {
        System.out.println("Contacts with name '" + name + "':");
        
        int i = index;
        while (i >= 0 && contacts[i].getName().equals(name)) {
            i--;
        }
        
        int j = index + 1;
        while (j < contacts.length && contacts[j].getName().equals(name)) {
            j++;
        }
        
        for (int k = i + 1; k < j; k++) {
            System.out.println(contacts[k]);
        }
    }
    public static int binarySearchByRelation(Contact[] contacts, String relation) {
        int left = 0;
        int right = contacts.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            int comparisonResult = relation.compareTo(contacts[mid].getRelation());
            
            if (comparisonResult == 0) {
                return mid;
            } else if (comparisonResult < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return -1;
    }
    
    public static void linearPrintRelation(Contact[] contacts, int index, String relation) {
        System.out.println("Contacts with relation '" + relation + "':");
        
        int i = index;
        while (i >= 0 && contacts[i].getRelation().equals(relation)) {
            i--;
        }
        
        int j = index + 1;
        while (j < contacts.length && contacts[j].getRelation().equals(relation)) {
            j++;
        }
        
        for (int k = i + 1; k < j; k++) {
            System.out.println(contacts[k]);
        }
    }

public static void sequentialSearchByBirthday(Contact[] contacts, String month) {
    System.out.println("Contacts with birthdays in month " + month + ":");

    for (Contact contact : contacts) {
        if (contact.getBirthday().substring(0, 3).equals(month)) {
            System.out.println(contact);
        }
    }
}


public static void sequentialSearchByPhoneNumber(Contact[] contacts, String phoneNumber) {
    System.out.println("Contacts with phone number '" + phoneNumber + "':");
    
    for (Contact contact : contacts) {
        if (contact.getPhone().equals(phoneNumber)) {
            System.out.println(contact);
        }
    }
}

public static void sequentialSearchByEmailAddress(Contact[] contacts, String emailAddress) {
    System.out.println("Contacts with email address '" + emailAddress + "':");
    
    for (Contact contact : contacts) {
        if (contact.getEmail().equals(emailAddress)) {
            System.out.println(contact);
        }
    }
}

    
}
