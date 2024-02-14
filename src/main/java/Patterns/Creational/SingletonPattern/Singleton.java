package Patterns.Creational.SingletonPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class Singleton {
    private static Singleton Instance;

    public static synchronized Singleton createInstance()
    {
        Lock lock = new ReentrantLock();
        if(Instance == null){
            lock.lock();
            if(Instance == null){
                System.out.println("creating new object");
                Instance = new Singleton();
            }else{
                System.out.println("Using already created object");
            }
            lock.unlock();
        }
        return Instance;
    }

    private Singleton(){
    }
}
