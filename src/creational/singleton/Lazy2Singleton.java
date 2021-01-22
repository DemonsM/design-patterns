package creational.singleton;

/**
 * 静态内部类实现懒汉式单例线程安全
 *
 * @author MT
 * @date 2021/1/22 14:18
 */
public class Lazy2Singleton {
    public Lazy2Singleton() {
    }

    public static Lazy2Singleton getInstance() {
        return SingletonHolder.instance;
    }

    public void doSomething() {
    }

    private static class SingletonHolder {
        public static Lazy2Singleton instance = new Lazy2Singleton();
    }
}
