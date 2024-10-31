package app;

public class PrinterImpl implements Printer {

    @Override
    public void print(Message message) {

        if ((message.getText() == null || message.getText().isEmpty()) &&
                (message.getSender() == null || message.getSender().isEmpty())) {

            Printer emptyMessagePrinter = new Printer() {
                @Override
                public void print(Message emptyMessage) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            emptyMessagePrinter.print(message);
        } else if (message.getSender() == null || message.getSender().isEmpty()) {

            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {

            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }
}