package app;

public class Main {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();

        Message message1 = new Message("Привіт всім!", "Олексій");
        printer.print(message1);

        Message message2 = new Message("Як справи?", null);
        printer.print(message2);

        Message message3 = new Message(null, null);
        printer.print(message3);
    }
}