package creational.abstractfactory;

/**
 * @author MT
 * @date 2021/1/22 13:39
 */
public class BananaFactory implements IFactory{
    @Override
    public Fruit create() {
        return new Banana();
    }
}
