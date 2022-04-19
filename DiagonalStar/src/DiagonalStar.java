public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
            return;
        }
        //First row
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
        //Second row
        System.out.print("**");
        for (int i = 0; i < number - 4; i++) {
            System.out.print(" ");
        }
        System.out.println("**");
        //From third to middle
        for (int i = 0; i < number / 2 - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < number - 6 - 2 * i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //Middle row - if exist
        if(number % 2 != 0){
            System.out.print("*");
            for (int i = 0; i < (number - 3) / 2; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 0; i < (number - 3) / 2; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //From middle to row before last
        for (int i = number / 2 - 3; i >= 0 ; i--) {
            System.out.print("*");
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < number - 6 - 2 * i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //Row before last
        System.out.print("**");
        for (int i = 0; i < number - 4; i++) {
            System.out.print(" ");
        }
        System.out.println("**");
        //Last row
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
