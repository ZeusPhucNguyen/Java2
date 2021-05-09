package Java2.Lap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactList extends Contact {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Contact> contact = new ArrayList<>();
        contact.add(new Contact("Phuc", "0987365245"));
        contact.add(new Contact("CHi", "0357854852"));
        contact.add(new Contact("Duong", "0859654745"));
        contact.add(new Contact("Thor", "0988888888"));
        contact.add(new Contact("Maria", "0986868686"));
    }
        public void addContact(){
            System.out.println("Enter new contact name:");
            String n = scan.nextLine();
            System.out.println("Enter phone number:");
            String p = scan.nextLine();
            contact.add(new user(n,p));
            System.out.println("New contact added: name = "+ n + ", phone = "+ p);
        }
    }

