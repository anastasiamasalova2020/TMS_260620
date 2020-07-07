import java.util.Random;
import java.util.Scanner;

public class MultiLevelArrays {
    public static void main(String[] args) {

//        String disc [] [] = new String[4][];
//
//        disc[0] = new String[3]; //Vasya
//        disc[1] = new String[4]; //Natasha
//        disc[2] = new String[4]; // Nastya
//        disc[3] = new String[3]; // Frosya
//
//
//        String philisophy = "Philisophy";
//        disc[1][1] = philisophy;
//
//        for (int i = 0; i < disc.length; i++) {
//            System.out.println(disc[i]);
//            for (int j = 0; j < disc[i].length; j++) {
//                System.out.println(disc[i][j] + "\t");
//            }
//
//        }

        Random rand = new Random();
        System.out.println("Enter array length: \n");
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();

        int arr[][] = new int[arrLength][arrLength];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i >= j) {
                    arr[i][j] = 8;
                }
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) continue;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int multArr [] [] [] = new int[5][][];

        multArr[0] = new int[3][];
        multArr[0][0] = new int[5];

    }
}
