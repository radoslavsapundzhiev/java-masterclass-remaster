import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int count = 0;
        while (true){
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int num = scanner.nextInt();
                count++;
                sum += num;
                avg = Math.round(sum / (double)count);
            } else {
                break;
            }
        }
        System.out.println("SUM = " + sum + " " + "AVG = " + avg);
        scanner.close();
    }
}
