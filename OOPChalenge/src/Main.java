public class Main {
    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger("base", "standard", "chicken", 8);
//        hamburger.showPrice();
//        Addition baseAddition1 = new Addition("lettuce", 1);
//        Addition baseAddition2 = new Addition("tomato", 2);
//        Addition baseAddition3 = new Addition("carrot", 1.5);
//        Addition baseAddition4 = new Addition("cucumber", 1.8);
//        hamburger.setBaseAddition1(baseAddition1);
//        hamburger.setBaseAddition2(baseAddition2);
//        hamburger.setBaseAddition3(baseAddition3);
//        hamburger.setBaseAddition4(baseAddition4);
//        hamburger.showPrice();
        HealthyBurger healthyBurger = new HealthyBurger("My healthy burger", "fish", 10);
        Addition addition1 = new Addition("lettuce", 1);
        Addition addition2 = new Addition("lutenitsa", 1.5);
        Addition addition3 = new Addition("ketchup", 1.8);
        Addition addition4 = new Addition("mayoneza", 1.1);
        Addition addition5 = new Addition("chilly", 1.2);
        Addition addition6 = new Addition("cabbage", 1.3);
        Addition addition7 = new Addition("tomato", 1.5);
        healthyBurger.setBaseAddition1(addition1);
        healthyBurger.setBaseAddition2(addition2);
        healthyBurger.setBaseAddition3(addition3);
        healthyBurger.setBaseAddition4(addition4);
        healthyBurger.setHealthyAddition1(addition5);
        healthyBurger.setHealthyAddition2(addition6);
        //healthyBurger.showPrice();
        Addition chips = new Addition("chips", 3);
        Addition drinks = new Addition("drinks", 2);
        DeluxeBurger deluxeBurger = new DeluxeBurger("My deluxe burger", "some type", "chicken", 15, chips, drinks);
        deluxeBurger.setBaseAddition1(addition1);
        deluxeBurger.setBaseAddition2(addition2);
        deluxeBurger.setBaseAddition3(addition3);
        deluxeBurger.setBaseAddition4(addition4);
        deluxeBurger.showPrice();
    }
}
