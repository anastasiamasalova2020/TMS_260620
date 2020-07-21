import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameFinished = false;
        //Массив battleField представляет собой поле боя. Элементы массива хранят три числа - 0;1;2
        //0 - соответствует поставленному 'нолику', 1 - крестику, 2 - клетка пустая
        int[][] battleField = new int[][]{{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};
        //Массивы letters и numbers нужны для визуализации поля и 'перевода' хода игрока в индекс элемента массива battleField
        String[] letters = new String[]{"a", "b", "c"};
        String[] numbers = new String[]{"1", "2", "3"};
        //Предполагается, что юзер всегда ходит первый и использует крестик
        while (!gameFinished) {
            //Вывод текущего состояния поля
            System.out.print("   ");
            for (int i = 0; i < 3; i++) {
                System.out.print(letters[i] + " ");
            }
            for (int i = 0; i < numbers.length; i++) {
                System.out.println();
                System.out.print(numbers[i] + " |");
                for (int j = 0; j < battleField.length; j++) {
                    switch (battleField[i][j]) {
                        case 0:
                            System.out.print("0" + " ");
                            break;
                        case 1:
                            System.out.print("X" + " ");
                            break;
                        case 2:
                            System.out.print(" " + " ");
                            break;
                    }
                }
            }
            System.out.println();
            boolean userStepDone = false;
            int validNumber = 0;
            int validLetter = 0;
            while (!userStepDone) {
                System.out.println("Введите ход в формате 1а: ");
                String inputtedValue = scanner.nextLine().toLowerCase();
                boolean result = inputtedValue.matches("[1-3]{1}[a,b,c]{1}");
                if (result) {
                    validNumber = Character.getNumericValue(inputtedValue.charAt(0)) - 1;
                    switch (inputtedValue.charAt(1)) {
                        case 'a':
                            validLetter = 0;
                            break;
                        case 'b':
                            validLetter = 1;
                            break;
                        case 'c':
                            validLetter = 2;
                            break;
                    }
                    if (battleField[validNumber][validLetter] == 2) {
                        userStepDone = true;
                    }
                }
            }
            //Меняем значение элемента массива в соответствии с ходом юзера
            battleField[validNumber][validLetter] = 1;
            //Проверяем горизонтальных и вертикальных строк
            int сrossesCounter = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (battleField[i][j] == 1) {
                        сrossesCounter++;
                    }
                }
                if (сrossesCounter == 3) {
                    System.out.println("Вы выиграли!");
                    gameFinished = true;
                } else {
                    сrossesCounter = 0;
                }
                for (int j = 0; j < 3; j++) {
                    if (battleField[j][i] == 1) {
                        сrossesCounter++;
                    }
                }
                if (сrossesCounter == 3) {
                    System.out.println("Вы выиграли!");
                    gameFinished = true;
                } else {
                    сrossesCounter = 0;
                }
            }
            //Проверяем диагонали
            for (int i = 0; i < 3; i++) {
                int j = 2 - i;
                if (battleField[i][j] == 1) {
                    сrossesCounter++;
                }
            }
            if (сrossesCounter == 3) {
                System.out.println("Вы выиграли!");
                gameFinished = true;
            } else {
                сrossesCounter = 0;
            }
            for (int i = 0; i < 3; i++) {
                if (battleField[i][i] == 1) {
                    сrossesCounter++;
                }
            }
            if (сrossesCounter == 3) {
                System.out.println("Вы выиграли!");
                gameFinished = true;
            }
            //Бот делает шаг, если игра еще не закончена
            if (!gameFinished) {
                boolean botStepDone = false;
                while (!botStepDone) {
                    int number = (int) (Math.random() * 3);
                    int letter = (int) (Math.random() * 3);
                    if (battleField[number][letter] == 2) {
                        battleField[number][letter] = 0;
                        botStepDone = true;
                    }
                }
                //Проверяем не выиграл ли бот
                //Проверяем горизонтальные и вертикальные строки
                int counterNulls = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (battleField[i][j] == 0) {
                            counterNulls++;
                        }
                    }
                    if (counterNulls == 3) {
                        System.out.println("Вы проиграли :(");
                        gameFinished = true;
                    } else {
                        counterNulls = 0;
                    }
                    for (int j = 0; j < 3; j++) {
                        if (battleField[j][i] == 0) {
                            counterNulls++;
                        }
                    }
                    if (counterNulls == 3) {
                        System.out.println("Вы проиграли 2:(");
                        gameFinished = true;
                    } else {
                        counterNulls = 0;
                    }
                }
                for (int i = 0; i < 3; i++) {
                    int j = 2 - i;
                    if (battleField[i][j] == 0) {
                        counterNulls++;
                    }
                }
                if (counterNulls == 3) {
                    System.out.println("Вы проиграли 3 :(");
                    gameFinished = true;
                } else {
                    counterNulls = 0;
                }
                for (int i = 0; i < 3; i++) {
                    if (battleField[i][i] == 0) {
                        counterNulls++;
                    }
                }
                if (counterNulls == 3) {
                    System.out.println("Вы проиграли 4:(");
                    gameFinished = true;
                }
            }
            //Проверяем, что еще есть пустые клетки
            int emptyCellsCounter = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (battleField[i][j] == 2) {
                        emptyCellsCounter++;
                    }
                }
            }
            if (emptyCellsCounter == 0) {
                System.out.println("Ничья!");
                gameFinished = true;
            }
        }
        //Выводим финальный вид поля
        System.out.print("   ");
        for (int i = 0; i < 3; i++) {
            System.out.print(letters[i] + " ");
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            System.out.print(numbers[i] + " |");
            for (int j = 0; j < battleField.length; j++) {
                switch (battleField[i][j]) {
                    case 0:
                        System.out.print("0" + " ");
                        break;
                    case 1:
                        System.out.print("X" + " ");
                        break;
                    case 2:
                        System.out.print(" " + " ");
                        break;
                }
            }
        }
        scanner.close();
    }
}
