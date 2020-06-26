public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Roma!!!");

        Car carMazdaObject = new Car();

        System.out.println("wheels: " + carMazdaObject.weheels);
        System.out.println("brand: " + carMazdaObject.brand);

        Car.horn();
    }

    static class Car{
        int weheels = 5;
        String brand = "Mazda";


        public static void horn() {
            System.out.println("BEEEP BEEEEP");
            int b;
            String caption = " + b";

            //My first comment

            /*
            * My second
            * comment
            * on
            * 5
            * rows
            * */

            /**
             * @param a - jest a String
             *  Many many
             *          many rows
             *          comment
             * */

            for (int i = 0; i < 100000; i++) {

            }
        }
    }
}

