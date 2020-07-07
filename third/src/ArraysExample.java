import java.util.Random;

public class ArraysExample {

    public static void main(String[] args) {
//        // Объявление массива
//        // <Тип> <имя массива> [];
//        String students [];
//        String [] tudents;
//
//        // Объявление и инициализация массива
//        // <Тип> <имя массива> [] = new String[10];
//        int students2 [] = new int[10];
//        // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
//
//        String students3 [] = new String[10];
//        //[null, null, null, null, null, null, null, null, null, null]
//
//        int students4 [] = {1,2,3,4,5,6,7,8,9,10};
//        String students5 [] = {"Vasya", "Petya", "Galya", "Sveta"};


//        String april = "April";
//
//        String [] month = {"January", "February", "March", april, "May", "June", "July", "August",
//                "September", "October", "November", "December"};
//
//        for (int i = 0; i < month.length; i++) {
//            System.out.println(month[i]);
//        }


        int array [] = new int[33];

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(30) + 3;
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}
