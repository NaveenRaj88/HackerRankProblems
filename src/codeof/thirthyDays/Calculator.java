package codeof.thirthyDays;

/**
 * Created by Naveen Kumar .A on 8/17/16.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println(divisorSum(12));
    }

    public static <T> void printArray(){

    }
    public static int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
