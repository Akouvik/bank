public class Checking extends Account {
  private static String accountType = "Checking";

  Checking(double initialDeposit) {
    // calls the parent of the Checking constructor which is the Account class
    super();
    // sets the balance on the Account class
    this.setBalance(initialDeposit);
    this.checkInterest(0);
  }

  @Override
  public String toString() {
    return " Account Type: " + accountType + " Account\n" + "Account Number: " + this.getAccountNumber() + "\n"
        + "Balance: " + this.getBalance() + "\n" + "Interest Rate: " + this.getInterest() + " %\n";
  }
}