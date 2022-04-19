public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        String numToStr = String.valueOf(number);
        for (int i = 0; i < numToStr.length(); i++) {
            int current = Integer.parseInt(String.valueOf(numToStr.charAt(i)));
            if (current % 2 == 0){
                sum += current;
            }
        }
        return sum;
    }
}
