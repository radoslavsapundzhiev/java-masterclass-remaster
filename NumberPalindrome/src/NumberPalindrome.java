public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverseNum = 0;
        int initNum = Math.abs(number);
        while (true){
            reverseNum += initNum % 10;
            initNum /= 10;
            if (initNum < 1) {
                break;
            }
            reverseNum *= 10;
        }

        return Math.abs(number) == reverseNum;
    }
}
