public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number < 2){
            return -1;
        }
        int largestPrime = -1;
        for (int i = 2; i <= number ; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && number % i == 0) {
                largestPrime = i;
            }
        }

        return largestPrime;
    }
}
