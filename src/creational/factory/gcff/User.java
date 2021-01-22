package creational.factory.gcff;

/**
 * @author MT
 * @date 2021/1/22 10:50
 */
public class User {
    private void eat() {
        AppleFactory appleFactory = new AppleFactory();
        Apple apple = appleFactory.create();
        BananaFactory bananaFactory = new BananaFactory();
        Banana banana = bananaFactory.create();
        apple.eat();
        banana.eat();
    }
}
