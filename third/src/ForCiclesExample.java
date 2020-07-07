import java.util.Scanner;

public class ForCiclesExample {

    public static void main(String[] args) {

        // 1. Мы должны получить от пользователя номер телефона
        // 2. Пока мы не получим валидный номер, мы будем долбить пользователю мозг сообщением 5 раз максимум
        // 3. Как только мы получим номер, мы от пользователя отстанем

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер вашего телефона в формате ХХУУУУУУУ");
        Long number = sc.nextLong();
        String numStr = String.valueOf(number);

        //break
        //continue
        //return

        for (int counter = 0; counter < 5 ; counter++) {
            if(numStr.length() == 9) {
                System.out.println("Красава, держи пять.");
                continue;
            }
            System.out.println("Вы ввели номер: " + numStr);
            System.out.println("Этот номер не верный! Попробуйте снова: \n");
            number = sc.nextLong();
            numStr = String.valueOf(number);
        }

        System.out.println("Программа завершена успешно!!!!");

        sc.close();
    }
}
