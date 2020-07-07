import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int a = 9874;
        int result = 0;
        int b;
        int n = 10000;
        while (a > 0) {
            b = a % 10;
            result += b * (n / 10);
            a /= 10;
            n /= 10;
        }
        System.out.println(result);
    }
}
