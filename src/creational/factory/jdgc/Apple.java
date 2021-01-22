package creational.factory.jdgc;

/**
 * @author MT
 * @date 2021/1/22 10:22
 */
public class Apple extends Fruit {
    private AppleSeed appleSeed;

    private Sunlight sunlight;

    private Water water;

    public Apple(AppleSeed appleSeed, Sunlight sunlight, Water water) {
        this.appleSeed = appleSeed;
        this.sunlight = sunlight;
        this.water = water;
    }
}
