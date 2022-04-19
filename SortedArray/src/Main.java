import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = getIntegers(5);
        printArray(array);
        int[] sortedArray = sortIntegers(array);
        printArray(sortedArray);
    }
    public static int[] getIntegers(int size) {
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integer values:\r");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    public static void printArray(int[] array) {
        if(array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Element " + i + " contents " + array[i]);
            }
        }
    }
    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if(sortedArray[i] < sortedArray[j]){
                    int tmp = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = tmp;
                }
            }
        }
        return sortedArray;
    }
}
