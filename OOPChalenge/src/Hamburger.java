public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private Addition baseAddition1;
    private Addition baseAddition2;
    private Addition baseAddition3;
    private Addition baseAddition4;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.baseAddition1 = new Addition("baseAddition1", 0);
        this.baseAddition2 = new Addition("baseAddition2", 0);
        this.baseAddition3 = new Addition("baseAddition3", 0);
        this.baseAddition4 = new Addition("baseAddition4", 0);
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        System.out.println("Base price: " + price);
        return price;
    }

    public Addition getBaseAddition1() {
        return baseAddition1;
    }

    public Addition getBaseAddition2() {
        return baseAddition2;
    }

    public Addition getBaseAddition3() {
        return baseAddition3;
    }

    public Addition getBaseAddition4() {
        return baseAddition4;
    }

    public void setBaseAddition1(Addition baseAddition1) {
        if (!getClass().getSimpleName().equals("DeluxeBurger")){
            this.baseAddition1 = baseAddition1;
        } else {
            System.out.println("Not allowed");
        }
    }

    public void setBaseAddition2(Addition baseAddition2) {
        if (!getClass().getSimpleName().equals("DeluxeBurger")){
            this.baseAddition2 = baseAddition2;
        } else {
            System.out.println("Not allowed");
        }
    }

    public void setBaseAddition3(Addition baseAddition3) {
        if (!getClass().getSimpleName().equals("DeluxeBurger")){
            this.baseAddition3 = baseAddition3;
        } else {
            System.out.println("Not allowed");
        }
    }

    public void setBaseAddition4(Addition baseAddition4) {
        if (!getClass().getSimpleName().equals("DeluxeBurger")){
            this.baseAddition4 = baseAddition4;
        } else {
            System.out.println("Not allowed");
        }
    }

    public double getAdditionsPrice() {
        if (!baseAddition1.getName().equals("baseAddition1")) {
            System.out.println(baseAddition1.getName() + ": " + baseAddition1.getPrice());
        }
        if (!baseAddition2.getName().equals("baseAddition2")) {
            System.out.println(baseAddition2.getName() + ": " + baseAddition2.getPrice());
        }
        if (!baseAddition3.getName().equals("baseAddition3")) {
            System.out.println(baseAddition3.getName() + ": " + baseAddition3.getPrice());
        }
        if (!baseAddition4.getName().equals("baseAddition4")) {
            System.out.println(baseAddition4.getName() + ": " + baseAddition4.getPrice());
        }

        double additions = this.getBaseAddition1().getPrice() +
            this.getBaseAddition2().getPrice() +
            this.getBaseAddition3().getPrice() +
            this.getBaseAddition4().getPrice();
        return additions;
    }

    public double showPrice() {
        double basePrice = getPrice();
        double additionsPrice = getAdditionsPrice();
        double total = basePrice + additionsPrice;

        System.out.println("Total = " + total);

        return total;
    }
}
