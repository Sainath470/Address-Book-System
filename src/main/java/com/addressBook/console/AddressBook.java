package com.addressBook.console;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
    String firstname;
    String lastname;
    String address;
    String city;
    String state;
    long phonenumber;
    String email;
    long zipcode;

    public void getUserDetails()//Method to get user details
    {
        System.out.println("Enter your First Name: ");
        Scanner firstvalue = new Scanner(System.in);
        this.firstname = firstvalue.nextLine();
        System.out.println("Enter your Last Name: ");
        Scanner lastvalue = new Scanner(System.in);
        this.lastname = lastvalue.nextLine();
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
        this.phonenumber = phone.nextLong();
        System.out.println("Enter your Email Id : ");
        Scanner Email = new Scanner(System.in);
        this.email = Email.nextLine();
        System.out.println("Enter your Zip Code : ");
        Scanner Zipcode = new Scanner(System.in);
        this.zipcode = Zipcode.nextLong();
    }

    public String getName() {
        this.firstname = firstname;
        return this.firstname;
    }

    public void editDetails() {
        Scanner userChoice = new Scanner(System.in);
        System.out.println("WHICH DETAILS YOU WANT TO CHANGE?");
        System.out.println("PRESS 1 FIRST NAME\nPRESS 2 LAST NAME\nPRESS 3 ADDRESS\nPRESS 4 CITY\nPRESS 5 STATE\nPRESS 6 PHONENUMBER\nPRESS 7 EMAIL\nPRESS 8 ZIPCODE\nIF DONE PRESS 9 EXIT");
        Scanner editdetailsinput = new Scanner(System.in);
        int Choice = editdetailsinput.nextInt();
        switch (Choice) {
            case 1:
                System.out.println("EDIT THE FIRST NAME TO: ");
                String edit_fname = userChoice.nextLine();
                this.firstname = edit_fname;
                break;
            case 2:
                System.out.println("EDIT THE LAST NAME TO: ");
                String edit_lname = userChoice.nextLine();
                this.lastname = edit_lname;
                break;
            case 3:
                System.out.println("EDIT THE ADDRESS TO: ");
                String edit_address = userChoice.nextLine();
                this.address = edit_address;
                break;
            case 4:
                System.out.println("EDIT THE CITY TO: ");
                String edit_city = userChoice.nextLine();
                this.city = edit_city;
                break;
            case 5:
                System.out.println("EDIT THE STATE TO: ");
                String edit_state = userChoice.nextLine();
                this.state = edit_state;
                break;
            case 6:
                System.out.println("EDIT THE PHONE NUMBER TO: ");
                long edit_num = userChoice.nextLong();
                this.phonenumber = edit_num;
                break;
            case 7:
                System.out.println("EDIT THE EMAIL TO:");
                String edit_email = userChoice.nextLine();
                this.email = edit_email;
                break;
            case 8:
                System.out.println("EDIT THE ZIP CODE TO:");
                long edit_zip = userChoice.nextLong();
                this.zipcode = edit_zip;
                break;
            default:
                break;
        }
    }

    public String toString() {
        return ("\nFIRST NAME: " + firstname + "\nLAST NAME: " + lastname + "\nADDRESS: " + address + "\nCITY: " + city + "\nSTATE: " + state + "\nPHONE NUMBER: " + phonenumber + "\nEMAIL ID: " + email + "\nZIP CODE:" + zipcode);
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
            System.out.println(list.toString());
        }
        System.out.println("IF YOU WANT TO EDIT DETAILS OF THE CONTACT: PRESS 1\nPRESS 2 FOR EXIT ");
        Scanner det = new Scanner(System.in);
        int details = det.nextInt();
        switch (details) {
            case 1:
                System.out.println("--ENTER THE FIRST NAME OF THE CONTACT FOR EDITING--");
                Scanner edit = new Scanner(System.in);
                String change = edit.nextLine();
                for (AddressBook i : list) {
                    if (i.getName().equals(change)) {
                        i.editDetails();
                    }
                    break;
                }
                System.out.println(list.toString());
                break;
            default:
                break;
        }
    //printing the contacts in the list
        System.out.println("\nContatcs in the Address Book are: ");
        for(int j = 0; j<list.size();j++)
        {
        System.out.println(list.get(j));
        }
}
    public static void main(String[] args) {
        addressBookOperation();
    }

}


