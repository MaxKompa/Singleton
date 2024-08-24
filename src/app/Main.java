package app;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Перше повідомлення логування");

        Logger logger2 = Logger.getInstance();
        logger2.log("Друге повідомлення логування");

        if (logger1 == logger2) {
            System.out.println("Logger1 та Logger2 - це той самий екземпляр");
        } else {
            System.out.println("Logger1 та Logger2 - це різні екземпляри");
        }
    }
}

