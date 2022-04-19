public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(100,true);
        printer.fillUpToner(2);
        System.out.println("Current toner level: " + printer.getTonerLevel());
        for (int i = 0; i < 80; i++) {
            printer.printPage();
        }
        printer.fillUpToner(10);
        System.out.println("Current toner level: " + printer.getTonerLevel());
    }
}
