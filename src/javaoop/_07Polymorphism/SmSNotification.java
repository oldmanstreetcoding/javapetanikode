package javaoop._07Polymorphism;

public class SmSNotification implements InterfaceNotifikasi{

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim SMS ke " + receiver + " dengan isi: " + content);
    }
}
