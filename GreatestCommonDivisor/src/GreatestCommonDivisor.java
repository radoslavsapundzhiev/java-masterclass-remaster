public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int delitel = Math.max(first, second);
        int delimo = Math.min(first, second);
        int nod;
        while (true){
            int remainder = delitel % delimo;
            if(remainder == 0){
                nod = delimo;
                break;
            }
            delitel = delimo;
            delimo = remainder;
        }
        return nod;
    }
}
