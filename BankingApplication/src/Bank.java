import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addBranch(String branchName){
        int position = findBranch(branchName);
        if(position >= 0){
            System.out.println("Branch with name " + branchName +
                    " already exists.");
        } else {
            Branch branch = Branch.createBranch(branchName);
            this.branches.add(branch);
        }
    }

    public void addCustomerToBranch(String customerName, double transaction, String branchName){
        int branchPosition = findBranch(branchName);
        if(branchPosition < 0){
            System.out.println("Branch with name " + branchName +
                    " don't exists.");
        } else {
            Branch branch = this.branches.get(branchPosition);
            branch.addCustomer(customerName, transaction);
        }
    }

    public void addCustomerTransactionToBranch(String customerName, double transaction, String branchName){
        int branchPosition = findBranch(branchName);
        if(branchPosition < 0){
            System.out.println("Branch with name " + branchName +
                    " don't exists.");
        } else {
            Branch branch = this.branches.get(branchPosition);
            branch.addTransaction(customerName, transaction);
        }
    }

    private int findBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            if(this.branches.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void showCustomersAndTransactionsForBranch(String branchName){
        int branchPosition = findBranch(branchName);
        if(branchPosition < 0){
            System.out.println("Branch with name " + branchName +
                    " don't exists.");
        } else {
            Branch branch = this.branches.get(branchPosition);
            for (int i = 0; i < branch.getCustomers().size(); i++) {
                Customer customer = branch.getCustomers().get(i);
                System.out.println((i+1) + ". " + customer.getName());
                for (int j = 0; j < customer.getTransactions().size(); j++) {
                    double transaction = customer.getTransactions().get(j);
                    System.out.println("\t" + (j+1) + ". " + transaction);
                }
            }
        }
    }
}
