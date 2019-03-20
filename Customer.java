
public class Customer {
  private final String firstName;
  private final String lastName;
  private final String ssn;
  private final Account account;

  Customer(String firstName, String lastName, String ssn, Account account) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.ssn = ssn;
    this.account = account;
  }

  @Override
  public String toString() {
    return "\n Customer Information\n " + "First Name " + firstName + " \n " + "Last Name " + lastName + " \n " + "ssn "
        + ssn + " \n " + "Account Number " + account.getAccountNumber();
  }

  public String basicInfo() {
    return "First Name " + firstName + " Last Name " + lastName + " ssn " + ssn + " account " + account;
  }

  Account getAccount() {
    return account;
  }
}