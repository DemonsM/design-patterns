package creational.prototype;

/**
 * Java 自带的 clone 方法是浅拷贝的。
 * 也就是说调用此对象的 clone 方法，只有基本类型的参数会被拷贝一份，非基本类型的对象不会被拷贝一份，而是继续使用传递引用的方式。
 * 如果需要实现深拷贝，必须要自己手动修改 clone 方法才行。
 *
 * @author MT
 * @date 2021/1/22 15:48
 */
public class MilkTea1 implements Cloneable {
    public String type;
    public boolean ice;

    @Override
    protected MilkTea1 clone() throws CloneNotSupportedException {
        return (MilkTea1) super.clone();
    }
}
