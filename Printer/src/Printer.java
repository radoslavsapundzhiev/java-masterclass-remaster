public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        this.tonerLevel = tonerLevel > -1 && tonerLevel <= 100 ? tonerLevel : -1;
        this.isDuplex = isDuplex;
    }

    public boolean getIsDuplex() {
        return isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void fillUpToner(int toner) {
        if (toner + this.tonerLevel > 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel += toner;
        }
    }

    public void printPage() {
        this.pagesPrinted += 1;
        this.tonerLevel -= 1;
    }
}
