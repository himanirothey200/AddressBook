package Service;

import Model.User;


import java.util.Scanner;

public class AddressBookImp {

    static User[] users;
    static Scanner sc = new Scanner(System.in);


    public void showCondition() {
        System.out.println("Enter your choice");
        System.out.println("1: Insert users");
        System.out.println("2: Display users");
        System.out.println("3: Edit the User Details");
        System.out.println("4: Delete the user Details");
        System.out.println("5: Terminate the applications");
    }

    public void insertUsers() {
        System.out.println("Enter how many users you want to insert: ");
        int numberOfUsers = sc.nextInt();
        users = new User[numberOfUsers];

        for (int i = 0; i < numberOfUsers; i++) {
            User user = new User();
            System.out.println("Enter the First Name: ");
            user.setFirstName(sc.next());
            System.out.println("Enter the Last Name");
            user.setLastName(sc.next());
            System.out.println("Enter the City: ");
            user.setCity(sc.next());
            System.out.println("Enter the State: ");
            user.setState(sc.next());
            System.out.println("Enter the zip: ");
            user.setZipcode(sc.next());
            System.out.println("Enter the mobileno: ");
            user.setMobileNo(sc.next());
            users[i] = user;
        }
    }

    public void displayUsers() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                System.out.println(users[i].toString());

            }


        }
    }

    public void editDetails() {
        User user1 = users[0];
        user1.setFirstName("kkkk");
        System.out.println("First name edited to: " + user1.getFirstName());
    }

    public void deleteDetails() {
        User user2 = users[0];
        users[0] = null;
        System.out.println("Details of the first user have been deleted.");
    }


}








