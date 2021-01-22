package creational.singleton;

/**
 * 单例模式
 * 懒汉式
 * 双检锁实现线程安全
 *
 * @author MT
 * @date 2021/1/22 13:57
 */
public class LazySingleton {
    public static LazySingleton instance = null;

    public LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
    }
}
