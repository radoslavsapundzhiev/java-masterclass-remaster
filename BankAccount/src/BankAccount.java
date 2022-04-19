public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double fund){
        this.balance += fund;
        System.out.println("You added " + fund + " money successfully to your account.");
    }

//    public void deposit(double fund){
//        this.setBalance(fund + this.getBalance());
//        System.out.println("You added " + fund + " money successfully to your account.");
//    }
    public void withdrawal(double fund){
        if(this.balance >= fund){
            this.balance -= fund;
            System.out.println("You successfully witdraw " + fund + " money from your account.");
        } else {
            System.out.println("You don't have enough money to withdraw.");
        }
    }
//    public boolean withdrawal(double fund){
//        if(this.getBalance() >= fund){
//            this.setBalance(this.getBalance() - fund);
//            System.out.println("You successfully witdraw " + fund + " money from your account.");
//            return true;
//        }
//        System.out.println("You don't have enough money to withdraw.");
//        return false;
//    }
}
