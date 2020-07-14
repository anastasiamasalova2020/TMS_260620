
public class Starter {
    public static void main(String[] args) {

        by.tms.jstudy.Runner jsRunner = new by.tms.jstudy.Runner();
        jsRunner.printClassName();

        com.kashanok.test.Runner tRunner = new com.kashanok.test.Runner();
        tRunner.printClassName();

        Starter starter = new Starter();
        System.out.println(starter.getClass().getName());

    }
}
