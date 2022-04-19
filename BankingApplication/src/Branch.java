import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public static Branch createBranch(String branchName) {
        return new Branch(branchName);
    }

    public void addCustomer(String customerName, double initialAmount){
        int position = findCustomer(customerName);
        if(position >= 0){
            System.out.println("Customer with name " + customerName
                + " already exists.");
        } else {
            Customer customer = Customer.createCustomer(customerName);
            customer.addTransaction(initialAmount);
            this.customers.add(customer);
        }
    }

    public void addTransaction(String customerName, double transaction) {
        int position = findCustomer(customerName);
        if(position >= 0){
            Customer customer = this.customers.get(position);
            customer.addTransaction(transaction);
        } else {
            System.out.println("Customer with name " + customerName
                    + " don't exists.");
        }
    }

    private int findCustomer(String name){
        for (int i = 0; i < this.customers.size(); i++) {
            if(this.customers.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
