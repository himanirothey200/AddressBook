package Controller;


import Service.AddressBookImp;


import java.util.Scanner;

public class AddressbookController {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        int choice = 1;
        while (choice != 0) {
            AddressBookImp addressBookImp = new AddressBookImp();


            addressBookImp.showCondition();

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addressBookImp.insertUsers();

                    break;

               case 2:
                    addressBookImp.displayUsers();
                    break;
                case 3:
                    addressBookImp.editDetails();
                    break;
                case 4:
                    addressBookImp.deleteDetails();
                    break;
                case 5:
                    // Terminate the application
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
