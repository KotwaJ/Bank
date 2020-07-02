import java.util.ArrayList;
import java.util.HashSet;

public class Bank {
    private HashSet<Customer>  customers;
    private ArrayList<Customer> customerArrayList = new ArrayList<>();

    Bank(){
        customers = new HashSet<>();
    }

    public  void addCustomer(Customer customer){
        customers.add(customer);

    }
    public void addCustomer(String firstName, String lastName){
       customerArrayList.add( new Customer(firstName, lastName));
       customers.addAll(customerArrayList);

    }

    public HashSet<Customer> getCustomers() {

        return customers;
    }

    public void setAccount(int index, Account account){
        customerArrayList.get(index).addAccount(account);

    }

}
