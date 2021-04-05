package com.addressBook.console;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class AddressBook {
    String firstname;
    String lastname;
    String address;
    String city;
    String state;
    long phoneNumber;
    String email;
    long zipcode;

    public void getUserDetails()//Method to get user details
    {
        System.out.println("Enter your First Name: ");
        Scanner firstName = new Scanner(System.in);
        this.firstname = firstName.nextLine();
        System.out.println("Enter your Last Name: ");
        Scanner lastName = new Scanner(System.in);
        this.lastname = lastName.nextLine();
        System.out.println("Enter your Address : ");
        Scanner Address = new Scanner(System.in);
        this.address = Address.nextLine();
        System.out.println("Enter your City : ");
        Scanner City = new Scanner(System.in);
        this.city = City.nextLine();
        System.out.println("Enter your State : ");
        Scanner State = new Scanner(System.in);
        this.state = State.nextLine();
        System.out.println("Enter your Phone Number : ");
        Scanner phone = new Scanner(System.in);
        this.phoneNumber = phone.nextLong();
        System.out.println("Enter your Email Id : ");
        Scanner Email = new Scanner(System.in);
        this.email = Email.nextLine();
        System.out.println("Enter your Zip Code : ");
        Scanner Zipcode = new Scanner(System.in);
        this.zipcode = Zipcode.nextLong();
    }

    public String getName() {
        return this.firstname;
    }

    public void editDetails() {
        Scanner userChoice = new Scanner(System.in);
        System.out.println("WHICH DETAILS YOU WANT TO CHANGE?");
        System.out.println("PRESS 1 FIRST NAME\nPRESS 2 LAST NAME\nPRESS 3 ADDRESS\nPRESS 4 CITY\nPRESS 5 STATE\nPRESS 6 PHONE NUMBER\nPRESS 7 EMAIL\nPRESS 8 ZIPCODE\nIF DONE PRESS 9 EXIT");
        Scanner detailsinput = new Scanner(System.in);
        int Choice =detailsinput.nextInt();
        switch (Choice) {
            case 1:
                System.out.println("EDIT THE FIRST NAME TO: ");
                this.firstname = userChoice.nextLine();
                break;
            case 2:
                System.out.println("EDIT THE LAST NAME TO: ");
                this.lastname = userChoice.nextLine();
                break;
            case 3:
                System.out.println("EDIT THE ADDRESS TO: ");
                this.address = userChoice.nextLine();
                break;
            case 4:
                System.out.println("EDIT THE CITY TO: ");
                this.city = userChoice.nextLine();
                break;
            case 5:
                System.out.println("EDIT THE STATE TO: ");
                this.state = userChoice.nextLine();
                break;
            case 6:
                System.out.println("EDIT THE PHONE NUMBER TO: ");
                this.phoneNumber = userChoice.nextLong();
                break;
            case 7:
                System.out.println("EDIT THE EMAIL TO:");
                this.email = userChoice.nextLine();
                break;
            case 8:
                System.out.println("EDIT THE ZIP CODE TO:");
                this.zipcode = userChoice.nextLong();
                break;
            default:
                break;
        }
    }

    public String toString() {
        return ("\nFIRST NAME: " + firstname + "\nLAST NAME: " + lastname + "\nADDRESS: " + address + "\nCITY: " + city + "\nSTATE: " + state + "\nPHONE NUMBER: " + phoneNumber + "\nEMAIL ID: " + email + "\nZIP CODE:" + zipcode);
    }

    public static void addressBookOperation() {
        System.out.println("----WELCOME TO THE ADDRESS BOOK PROGRAM-----");
        System.out.println("PLEASE ENTER YOUR DETAILS IN THE ADDRESS BOOK");
        ArrayList<AddressBook> list = new ArrayList<>();
        System.out.println("How many contacts you want to add: ");
        Scanner userinput = new Scanner(System.in);
        int user = userinput.nextInt();
        for (int i = 0; i < user; i++) {
           AddressBook person = new AddressBook();//creating object
            person.getUserDetails();//calling the method using object
            list.add(person);//adding the details to list using object
        }
        System.out.println("\nContacts in the Address Book are: ");
        for (AddressBook addressBook : list) {
            System.out.println(addressBook);
        }


        System.out.println("IF YOU WANT TO EDIT DETAILS OF THE CONTACT: PRESS 1 FOR EDITING \nPRESS 2 FOR EXIT");
        Scanner input = new Scanner(System.in);
        int in=input.nextInt();
        switch(in)
        {
            case 1:System.out.println(list.toString());
                    System.out.println("--ENTER THE FIRST NAME OF THE CONTACT FOR EDITING--");
                    Scanner str=new Scanner(System.in);
                for (AddressBook addressBook : list) {
                    System.out.println(addressBook.firstname);
                }
                    String usingFirstname=str.nextLine();
                            for (AddressBook i:list) {
                                if (i.getName().equals(usingFirstname)) {
                                    i.editDetails();
                                    System.out.println(list.toString());
                                }
                                break;
                            }
                             break;
            default:
                break;
        }
        System.out.println("IF YOU WANT TO EDIT DETAILS OF THE CONTACT: PRESS 1 FOR DELETING \nPRESS 2 FOR EXIT");
        Scanner input2 = new Scanner(System.in);
        int in2=input2.nextInt();
        switch (in2) {
            case 1 -> {
                System.out.println(list.toString());
                for (AddressBook addressBook : list) {
                    System.out.println(addressBook.firstname);
                }
                System.out.println("--ENTER THE FIRST NAME OF THE CONTACT FOR DELETING--");
                Scanner edit1 = new Scanner(System.in);
                String store = edit1.nextLine();
                for (AddressBook i : list) {
                    if(i.getName().equals(store)){
                        list.remove(i);
                    }
                    break;
                }
            }
        }
    //printing the contacts in the list
        System.out.println("\nContacts in the Address Book are: ");
        for (AddressBook addressBook : list) {
            System.out.println(addressBook);
        }
}
    public static void main(String[] args) {
        addressBookOperation();
    }

}


