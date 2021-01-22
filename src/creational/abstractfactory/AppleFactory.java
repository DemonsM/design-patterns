package creational.abstractfactory;

/**
 * @author MT
 * @date 2021/1/22 13:37
 */
public class AppleFactory implements IFactory {
    @Override
    public Fruit create() {
        return new Apple();
    }
}
