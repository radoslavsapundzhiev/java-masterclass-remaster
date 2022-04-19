public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(-96));
        System.out.println(sumDigits(15879));
    }
    public static int sumDigits(int number){
        int sum = 0;
        if(number < 10) {
            return -1;
        }

        while (number > 0){
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
