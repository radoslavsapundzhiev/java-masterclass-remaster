public class Main {
    public static void main(String[] args) {
        VipCustomer firstVipCustomer = new VipCustomer();
        System.out.println("Name: " + firstVipCustomer.getName() + "\n" +
                "Credit limit: " + firstVipCustomer.getCreditLimit() + "\n" +
                "Email: " + firstVipCustomer.getEmail());
        VipCustomer secondVipCustomer = new VipCustomer("Pesho", 15000.0);
        System.out.println("Name: " + secondVipCustomer.getName() + "\n" +
                "Credit limit: " + secondVipCustomer.getCreditLimit() + "\n" +
                "Email: " + secondVipCustomer.getEmail());
        VipCustomer thirdVipCustomer = new VipCustomer("Gosho", 18000.0, "gosho@mail.com");
        System.out.println("Name: " + thirdVipCustomer.getName() + "\n" +
                "Credit limit: " + thirdVipCustomer.getCreditLimit() + "\n" +
                "Email: " + thirdVipCustomer.getEmail());
    }
}
