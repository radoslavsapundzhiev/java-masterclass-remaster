public class HealthyBurger extends Hamburger{
    private Addition healthyAddition1;
    private Addition healthyAddition2;

    public HealthyBurger(String name, String meat, double price) {
        super(name, "brown rye", meat, price);
        this.healthyAddition1 = new Addition("healthyAddition1", 0);
        this.healthyAddition2 = new Addition("healthyAddition2", 0);
    }

    public Addition getHealthyAddition1() {
        return healthyAddition1;
    }

    public Addition getHealthyAddition2() {
        return healthyAddition2;
    }

    public void setHealthyAddition1(Addition healthyAddition1) {
        this.healthyAddition1 = healthyAddition1;
    }

    public void setHealthyAddition2(Addition healthyAddition2) {
        this.healthyAddition2 = healthyAddition2;
    }

    @Override
    public double getAdditionsPrice() {
        if (!healthyAddition1.getName().equals("healthyAddition1")) {
            System.out.println(healthyAddition1.getName() + ": " + healthyAddition1.getPrice());
        }
        if (!healthyAddition2.getName().equals("healthyAddition2")) {
            System.out.println(healthyAddition2.getName() + ": " + healthyAddition2.getPrice());
        }
        double additions = super.getAdditionsPrice() + this.getHealthyAddition1().getPrice() +
                this.getHealthyAddition2().getPrice();
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
