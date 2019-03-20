public class Savings extends Account {
  private static String accountType = "Checking";

  Savings(double initialDeposit) {
    // calls the parent of the Checking constructor which is the Account class
    super();
    // sets the balance on the Account class
    this.setBalance(initialDeposit);
    if (initialDeposit > 10000) {
      this.setInterest(5);
    } else {
      this.setInterest(2);
    }
  }

  @Override
  public String toString() {
    return " Account Type" + accountType + "Account\n" + "Account Number: " + this.getAccountNumber() + "\n"
        + "Balance: " + this.getBalance() + "\n" + "Interest Rate: " + this.getInterest();
  }
}