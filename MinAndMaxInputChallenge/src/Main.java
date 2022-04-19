import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (true){
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int num = scanner.nextInt();
                if(num < min){
                    min = num;
                }
                if(num > max) {
                    max = num;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
