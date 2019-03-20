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
    System.out.println("!      Where your money stays save and cozy  ");
    System.out.println("+-----------------");

  }

  private void printMenu() {
    System.out.println("Please make a selection:");
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
        System.out.print("Enter your choice:");

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
      createAnAccount();
      break;
    case 2:
      // make a deposit
      makeADeposit();
      break;
    case 3:
      // make a withdraw
      makeAwithdraw();
      break;
    case 4:
      // list balances
      listBalance();
      break;
    default:
      System.out.println("UNKNOWN ERROR HAS OCCURED");
    }
  }

  public void createAnAccount() {
    String firstName, lastName, ssn, accountType = "";
    double initialDeposit = 0;

    boolean valid = false;

    while (!valid) {
      System.out.print("Please enter in account type(checking/saving):");
      accountType = keyboard.nextLine();
      if (accountType.equalsIgnoreCase("checking") || accountType.equalsIgnoreCase("saving")) {
        valid = true;
      } else {
        System.out.println("Invalid account type. please enter checking or saving");
      }
    }
    System.out.print("Please enter first name:");
    firstName = keyboard.nextLine();
    System.out.print("Please enter last name:");
    lastName = keyboard.nextLine();
    System.out.print("Please enter ssn:");
    ssn = keyboard.nextLine();

    valid = false;
    while (!valid) {
      System.out.print("Please enter an initial deposit:");
      try {
        initialDeposit = Double.parseDouble(keyboard.nextLine());
      } catch (NumberFormatException e) {
        System.out.println("Deposit must be a number");
      }
      if (accountType.equalsIgnoreCase("checking")) {
        if (initialDeposit < 100) {
          System.out.println("Checking accounts require $100 or above to open");
        } else {
          valid = true;
        }
      } else if (accountType.equalsIgnoreCase("saving")) {
        if (initialDeposit < 50) {
          System.out.println("Checking accounts require $50 or above to open");
        } else {
          valid = true;
        }

      }
    }
    Account account;
    if (accountType.equalsIgnoreCase("checking")) {
      account = new Checking(initialDeposit);
    } else {
      account = new Savings(initialDeposit);
    }
    Customer customer = new Customer(firstName, lastName, ssn, account);
    bank.addCustomer(customer);
  }

  public void makeADeposit() {

  }

  public void makeAwithdraw() {

  }

  public void listBalance() {

  }
}