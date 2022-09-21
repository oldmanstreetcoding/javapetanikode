package javaoop._07Polymorphism;

public class EmailNotification implements InterfaceNotifikasi{

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim email ke " + receiver + " dengan isi: " + content);
    }
}
