public class DeluxeBurger extends Hamburger{
    private Addition chips;
    private Addition drinks;

    public DeluxeBurger(String name, String breadRollType, String meat, double price, Addition chips, Addition drinks) {
        super(name, breadRollType, meat, price);
        this.chips = chips;
        this.drinks = drinks;
    }

    public Addition getChips() {
        return chips;
    }

    public Addition getDrinks() {
        return drinks;
    }

    @Override
    public double getAdditionsPrice() {
        System.out.println(chips.getName() + ": " + chips.getPrice());
        System.out.println(drinks.getName() + ": " + drinks.getPrice());
        double additions = chips.getPrice() +
                drinks.getPrice();
        System.out.println("Additions = " + additions);
        return additions;
    }

    @Override
    public double showPrice() {
        double basePrice = getPrice();
        double additionsPrice = getAdditionsPrice();
        double total = basePrice + additionsPrice;

        System.out.println("Total = " + total);

        return total;
    }
}
