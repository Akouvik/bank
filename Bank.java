import java.util.ArrayList;

// import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

public class Bank {

  ArrayList<Customer> customers = new ArrayList<Customer>();

  void addCustomer(Customer customer) {
    customers.add(customer);
  }

  Customer getCustomer(int account) {
    return customers.get(account);
  }

  ArrayList<Customer> getCustomers() {
    return customers;
  }
}