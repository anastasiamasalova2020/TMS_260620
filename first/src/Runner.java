import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        byte octet = 127;
        String bin = String.format("%8s", Integer.toBinaryString(octet)).replace(' ', '0');
        System.out.println(bin);
    }
}
