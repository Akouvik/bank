public class Account {
  private double balance = 0;
  private double interest = 0.02;
  private int accountNumber;

  private static int numberOfAccounts = 10000000;

  Account() {
    accountNumber = numberOfAccounts++;
  }

  /**
   * @return the balance
   */
  public double getBalance() {
    return balance;
  }

  /**
   * @return the accountNumber
   */
  public int getAccountNumber() {
    return accountNumber;
  }

  /**
   * @return the interest
   */
  public double getInterest() {
    return interest * 100;
  }

  /**
   * @param interest the interest to set
   */
  public void setInterest(double interest) {
    this.interest = interest;
  }

  /**
   * @param balance the balance to set
   */
  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void withdraw(double amount) {
    if (amount + 5 > balance) {
      System.out.println("You have insufficient funds");
      return;
    }
    balance -= amount + 5;
    System.out.println("you have withdrawn " + amount + "dollars and incurred a fee of $5");
    System.out.println("you now have a balance of " + balance);

  }

  public void deposit(double amount) {
    if (amount < 0) {
      System.out.println("You cannot deposit negative money");
      return;
    }
    checkInterest();
    amount = amount + amount * (interest * 100);
    balance += amount;
    System.out
        .println("You have deposited $ " + amount + "dollars with an interest rate of " + (interest * 100) + "percent");
    System.out.println("you now have a balance of $" + balance);

  }

  public void checkInterest() {
    if (balance > 10000) {
      interest = 0.05;
    } else {
      interest = 0.02;
    }
  }
}