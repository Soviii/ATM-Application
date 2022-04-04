import java.util.Scanner;

public class ATM {

    public static void clearScreen() {
        System.out.print("\n\n\n\n\n\n");
        System.out.flush();
    }

    public static void menuScreen() {
        System.out.println("**************************************");
        System.out.println("* 1. Deposit                         *");
        System.out.println("* 2. Withdraw                        *");
        System.out.println("* 3. View Balance                    *");
        System.out.println("* 4. View Account ID                 *");
        System.out.println("* 5. Logout                          *");
        System.out.println("**************************************");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account Sovi = new Account("Sovi");
        int option;
        int amount;

atmLoop:while (true) {

            menuScreen();
            System.out.println("Please enter an option");
            option = input.nextInt();

            switch (option) {
                case 1:
                    clearScreen();
                    System.out.println("How much would you like to deposit?");
                    amount = input.nextInt();
                    clearScreen();
                    Sovi.deposit(amount);
                    System.out.println("Deposit was successful, you now have $" + Sovi.getBalance());
                    break;

                case 2:
                    clearScreen();
                    System.out.println("How much would you like to withdraw?");
                    amount = input.nextInt();
                    clearScreen();
                    if (amount > Sovi.getBalance()) {
                        System.out.println("You do not have enough funds for this withdrawal");
                    } else {
                        Sovi.withdraw(amount);
                        System.out.println("Withdraw was successful, you now have $" + Sovi.getBalance());
                    }
                    break;

                case 3:
                    clearScreen();
                    System.out.println("Your current balance is $" + Sovi.getBalance());
                    break;

                case 4:
                    clearScreen();
                    System.out.println("Your account ID is " + Sovi.getID());
                    break;

                case 5:
                    clearScreen();
                    System.out.println("Have a nice day!");
                    break atmLoop;
            }
        }
    }
}

