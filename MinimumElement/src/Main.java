import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int count = readInteger();
        int[] array = readElements(count);
        int min = findMin(array);
        System.out.println("Min = " + min);
    }
    private static int readInteger() {
        System.out.println("Enter integer number:\r");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
    private static int[] readElements(int count){
        int[] array = new int[count];
        System.out.println("Enter " + count + " itegers\r");
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            scanner.nextLine();
            array[i] = num;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
