public class Main {
    public static void main(String[] args) {
        Bank dskBank = new Bank("DSK");

        dskBank.addBranch("CREDITS");
        dskBank.addBranch("DEPOSIT");

        dskBank.addCustomerToBranch("GOSHO", 200, "CREDITS");
        dskBank.addCustomerToBranch("PESHO", 350, "CREDITS");
        dskBank.addCustomerToBranch("GOSHO", 220, "CREDITS");

        dskBank.addCustomerToBranch("TOSHO", 150, "DEPOSIT");
        dskBank.addCustomerToBranch("GOSHO", 210, "DEPOSIT");
        dskBank.addCustomerToBranch("KIRO", 320, "DEPOSIT");

        dskBank.addCustomerTransactionToBranch("GOSHO", 250, "CREDITS");
        dskBank.addCustomerTransactionToBranch("GOSHO", 220, "CREDITS");
        dskBank.addCustomerTransactionToBranch("TOSHO", 520, "DEPOSIT");
        dskBank.addCustomerTransactionToBranch("KIRO", 120, "DEPOSIT");
        dskBank.addCustomerTransactionToBranch("KIROO", 420, "CREDITS");

        dskBank.showCustomersAndTransactionsForBranch("CREDITS");
        dskBank.showCustomersAndTransactionsForBranch("DEPOSIT");
    }
}
