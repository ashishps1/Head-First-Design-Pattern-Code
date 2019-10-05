package Chapter5;

public class SingletonNormal {
    private static SingletonNormal uniqueInstance;
    private SingletonNormal() {}
    public static SingletonNormal getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new SingletonNormal();
        }
        return uniqueInstance;
    }
}
