package creational.factory.jdgc;

/**
 * 简单工厂模式
 *
 * @author MT
 * @date 2021/1/22 10:00
 */
public class FruitFactory {
    public Fruit create(String type) {
        switch (type) {
            case "苹果":
                AppleSeed appleSeed = new AppleSeed();
                Sunlight sunlight = new Sunlight();
                Water water = new Water();
                return new Apple(appleSeed, sunlight, water);
            case "香蕉":
                return new Banana();
            default:
                throw new IllegalArgumentException("暂时没有这种水果");
        }
    }
}
