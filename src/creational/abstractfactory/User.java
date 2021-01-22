package creational.abstractfactory;

/**
 * @author MT
 * @date 2021/1/22 13:41
 */
public class User {
    private void eat() {
        IFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.create();
        IFactory bananaFactory = new BananaFactory();
        Fruit banana = bananaFactory.create();
        apple.eat();
        banana.eat();
    }
}
