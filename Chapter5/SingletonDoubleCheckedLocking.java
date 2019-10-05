package Chapter5;

public class SingletonDoubleCheckedLocking {
    private static SingletonDoubleCheckedLocking uniqueInstance;
    private SingletonDoubleCheckedLocking() {}
    public static SingletonDoubleCheckedLocking getInstance() {
        if(uniqueInstance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return uniqueInstance;
    }
}
