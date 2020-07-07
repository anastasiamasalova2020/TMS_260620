public class EmbeddedForCicle {
    public static void main(String[] args) {

        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};

        for (int i = 0; i < 12; i++) {
            System.out.println(month[i] + ": ");



            for (int j = 1; j < 31; j++) {
                if(i == 1 && j == 29) break;
                System.out.print(j + "\t");
                if(j % 7 == 0 ) System.out.println();
            }


            System.out.println();
        }

    }
}
