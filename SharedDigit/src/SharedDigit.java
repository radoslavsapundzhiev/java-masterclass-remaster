public class SharedDigit {
   public static boolean hasSharedDigit(int num1, int num2){
       if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
           return false;
       }
       String num1ToStr = String.valueOf(num1);
       String num2ToStr = String.valueOf(num2);
       for (int i = 0; i < num1ToStr.length(); i++) {
           int currentNum1Digit = Integer.parseInt(String.valueOf(num1ToStr.charAt(i)));
           for (int j = 0; j < num2ToStr.length(); j++) {
                int currentNum2Digit = Integer.parseInt(String.valueOf(num2ToStr.charAt(j)));
                if (currentNum1Digit == currentNum2Digit){
                    return true;
                }
           }
       }
       return false;
   }
}
