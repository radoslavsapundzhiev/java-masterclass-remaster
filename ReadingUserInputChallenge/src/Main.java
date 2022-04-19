import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (true){
            System.out.println("Enter number #" + count + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                count++;
                sum += scanner.nextInt();
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
            if(count == 11){
                break;
            }
        }
        scanner.close();
        System.out.println("Sum is: " + sum);
    }
}
