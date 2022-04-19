public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if ((bigCount * 5 + smallCount) >= goal) {
            int maxBigPacks = goal / 5;
            int usedBigPacks = bigCount - maxBigPacks;
            if(usedBigPacks < 0) {
                int bigPacks = maxBigPacks - bigCount;
                if(smallCount >= bigPacks * 5 + goal % 5){
                    return true;
                }
            } else {
                if (smallCount >= goal % 5){
                    return true;
                }
            }
        }
        return false;
    }
}
