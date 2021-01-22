package creational.factory.jdgc;

/**
 * @author MT
 * @date 2021/1/22 10:24
 */
public class User {
    private static void eat() {
        FruitFactory factory = new FruitFactory();
        Fruit apple = factory.create("苹果");
        Fruit banana = factory.create("香蕉");
        // factory.create("橘子");
        apple.eat();
        banana.eat();
    }

    public static void main(String[] args) {
        eat();
    }
}
