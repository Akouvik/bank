import java.util.Scanner;

public class Menu {
  // instance variable

  Scanner keyboard = new Scanner(System.in);
  Bank bank = new Bank();
  boolean exit;

  public static void main(String[] args) {
    Menu menu = new Menu();
    menu.runMenu();
  }

  public void runMenu() {
    printHeader();
    while (!exit) {
      printMenu();
      int choice = getInput();
      performAction(choice);
    }
  }

  private void printHeader() {
    System.out.println("+-----------------");
    System.out.println("!      Welcome to Akouvi's Bank        ");
    System.out.println("!      Awesome Bank App                ");
    System.out.println("+-----------------");

  }

  private void printMenu() {
    System.out.println("Please make a selection");
    System.out.println("1)    Create new account   ");
    System.out.println("2)    Make a deposit");
    System.out.println("3)    Make a widthdraw");
    System.out.println("4)    List Accoutn balance");
    System.out.println("0)    exit");

  }

  public int getInput() {

    int choice = -1;
    do {

      try {
        System.out.print("Enter your choice");

        choice = Integer.parseInt(keyboard.nextLine());
      } catch (NumberFormatException e) {
        System.out.println("INVALID SELECTION, Numbers only please");
      }
      if (choice < 0 || choice > 4) {
        System.out.println("CHOICE OUTSIDE OF RANGE CHOOSE AGAIN");
      }
    } while (choice < 0 || choice > 4);
    return choice;

  }

  private void performAction(int choice) {
    switch (choice) {
    case 0:
      System.out.println("Thank you for using my application");
      System.exit(0);
      break;
    case 1:
      // create an account
      // System.out.println("create an account");
      break;
    case 2:
      // make a deposit
      // System.out.println("create an account");
      break;
    case 3:
      // make a withdraw
      // System.out.println("create an account");
      break;
    case 4:
      // list balances
      // System.out.println("create an account");
      break;

    default:
      System.out.println("UNKNOWN ERROR HAS OCCURED");
    }
  }
}