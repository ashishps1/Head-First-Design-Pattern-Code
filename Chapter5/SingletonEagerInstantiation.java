package Chapter5;

public class SingletonEagerInstantiation {
    private static SingletonEagerInstantiation uniqueInstance = new SingletonEagerInstantiation();
    private SingletonEagerInstantiation() {}
    public static SingletonEagerInstantiation getInstance() {
        return uniqueInstance;
    }
}
