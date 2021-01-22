package creational.factory.gcff;

/**
 * @author MT
 * @date 2021/1/22 10:44
 */
public class AppleFactory {
    public Apple create() {
        AppleSeed appleSeed = new AppleSeed();
        Sunlight sunlight = new Sunlight();
        Water water = new Water();
        return new Apple(appleSeed, sunlight, water);
    }
}
