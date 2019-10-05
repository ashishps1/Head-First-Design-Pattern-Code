package Chapter5;

public class SingletonSynchronized {
    private static SingletonSynchronized uniqueInstance;
    private SingletonSynchronized() {};
    public static synchronized SingletonSynchronized getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new SingletonSynchronized();
        }
        return uniqueInstance;
    }
}
