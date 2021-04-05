package com.addressBook.console;
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

    public String toString() {
        return ("\nFIRST NAME: " + firstname + "\nLAST NAME: " + lastname + "\nADDRESS: " + address + "\nCITY: " + city + "\nSTATE: " + state + "\nPHONE NUMBER: " + phonenumber + "\nEMAIL ID: " + email + "\nZIP CODE:" + zipcode);
    }

    public static void main(String[] args) {
        System.out.println("----WELCOME TO THE ADDRESS BOOK PROGRAM-----");
        System.out.println("PLEASE ENTER YOUR DETAILS IN THE ADDRESS BOOK");
        ArrayList<AddressBook> list = new ArrayList<>();
        System.out.println("How many contacts you want to add: ");
        Scanner userinput=new Scanner(System.in);
        int user=userinput.nextInt();
        for(int i=0;i<user;i++)
        {
            AddressBook person = new AddressBook();//creating object
            person.getUserDetails();//calling the method using object
            list.add(person);//adding the details to list using object
            System.out.println(list.toString());
        }
        //printing the contacts in the list
        System.out.println("Contatcs in the Address Book are: ");
        for(int j=0;j<list.size();j++)
        {
            System.out.println(list.get(j));
        }
    }
}


