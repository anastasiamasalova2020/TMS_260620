import java.util.Scanner;

public class RegularIfAndSwitchCase {
    public static void main(String[] args) {

        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер месяца: \n");
        int choise = sc.nextInt();
        sc.close();

        if(choise >= 0 && choise < 2  || choise == 11) {
            System.out.println("Winter is coming....");
        } else if (choise >= 2 && choise < 5){
            System.out.println("Spring :)");
        } else if(choise >=5 && choise < 8) {
            System.out.println("Summer time!!!");
        } else {
            System.out.println("Autumn is boring...");
        }



        switch (choise) {
            case 1:
                System.out.println(month[0]);
                break;
            case 2:
                System.out.println(month[1]);
                break;
            case 3:
                System.out.println(month[2]);
                break;
            case 4:
                System.out.println(month[3]);
                break;
            case 5:
                System.out.println(month[4]);
                break;
            case 6:
                System.out.println(month[5]);
                break;
            case 7:
                System.out.println(month[6]);
                break;
            case 8:
                System.out.println(month[7]);
                break;
            case 9:
                System.out.println(month[8]);
                break;
            case 10:
                System.out.println(month[9]);
                break;
            case 11:
                System.out.println(month[10]);
                break;
            case 12:
                System.out.println(month[11]);
                break;
                default:
                    System.out.println("Month you've passed is wrong!!");
        }



    }
}
