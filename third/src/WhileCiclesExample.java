import java.util.Scanner;

public class WhileCiclesExample {
    public static void main(String[] args) {

        //  1. Мы должны получить от пользователя номер телефона
        // 2. Пока мы не получим валидный номер, мы будем долбить пользователю мозг сообщением
        // 3. Как только мы получим номер, мы от пользователя отстанем

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер вашего телефона в формате ХХУУУУУУУ");
        Long number = sc.nextLong();
        String numStr = String.valueOf(number);

        int counter = 0;

        do {
            System.out.println("Вы ввели номер: " + numStr + ". И он верный: " + (numStr.length() == 9));
            counter++;
        }
        while (numStr.length() == 9 && counter < 5);

        sc.close();

//        System.out.println("Вы ввели все верно! Красавчик!!! Или красотка!!!");


    }
}
