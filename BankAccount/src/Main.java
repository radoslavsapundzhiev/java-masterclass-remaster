public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("1111");
        account.setCustomerName("Pesho");
        account.setBalance(9650.0);
        account.setEmail("pesho@abv.bg");
        account.setPhoneNumber("8562356");
        account.deposit(45.0);
        System.out.println(account.getBalance());
        account.withdrawal(9600.0);
        System.out.println(account.getBalance());
        account.withdrawal(100.0);
        System.out.println(account.getBalance());
    }
}
