public class NumberToWords {
    public static void numberToWords(int number){
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reversedNum = reverse(number);
        int revNumDigits = getDigitCount(reversedNum);
        int numDigits = getDigitCount(number);

        while (reversedNum > 0) {
            int remainder = reversedNum % 10;
            switch (remainder){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            reversedNum /= 10;
        }
        if(revNumDigits != numDigits){
            for (int i = 0; i < numDigits - revNumDigits; i++) {
                System.out.println("Zero");
            }
        }
        if (number == 0){
            System.out.println("Zero");
        }
    }

    public static int reverse(int number){
        int reversedNum = 0;
        int initNum = Math.abs(number);
        while (true){
            reversedNum += initNum % 10;
            initNum /= 10;
            if(initNum < 1){
                break;
            }
            reversedNum *= 10;
        }
        return number < 0 ? reversedNum * (-1) : reversedNum;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        while (true){
            number /= 10;
            count++;
            if (number < 1) {
                break;
            }
        }
        return count;
    }
}
