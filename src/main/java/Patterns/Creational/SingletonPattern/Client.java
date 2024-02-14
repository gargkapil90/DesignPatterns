package Patterns.Creational.SingletonPattern;

public class Client {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            Thread th1 = new Thread(() -> {
                Singleton.createInstance();
                System.out.println(Thread.currentThread().getName());
            });
            th1.start();
        }
    }
}
