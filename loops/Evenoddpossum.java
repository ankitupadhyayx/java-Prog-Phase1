//the num is given 8765; 
//so calculate add of even pos and odd position
//

public class Evenoddpossum {
    public static void main(String[] args) {
        int num = 8765;
        int position = 0;
        int oddSum = 0;
        int evenSum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            position++;
            if (position % 2 == 0) {
                evenSum = evenSum + lastDigit;
            } else {
                oddSum = oddSum + lastDigit;
            }
            num = num / 10;
        }
        System.out.println("Even pos sum "+evenSum);
        System.out.println("odd pos sum "+ oddSum);
    }
}
