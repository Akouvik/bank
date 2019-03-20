import java.util.ArrayList;

public class Bank {

  ArrayList<Customer> customers = new ArrayList<Customer>();

  void addCustomer(Customer customer) {
    customers.add(customer);
  }
}