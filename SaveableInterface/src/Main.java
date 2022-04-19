import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player pesho = new Player("Pesho", 15);
        save(pesho);
        System.out.println(pesho);
        restore(pesho);
        pesho.setHealth(20);
        System.out.println(pesho);
    }

    public static void save(ISaveble objToSave){
        for (int i = 0; i < objToSave.write().size(); i++) {
            System.out.println("Saving " + objToSave.write().get(i));
        }
    }

    public static void restore(ISaveble objToRestore){
        List<String> values = readValues();
        objToRestore.read(values);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
