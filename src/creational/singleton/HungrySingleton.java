package creational.singleton;

/**
 * 单例模式
 * 饿汉式
 *
 * @author MT
 * @date 2021/1/22 13:52
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    public HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public void doSomething() {
    }
}
