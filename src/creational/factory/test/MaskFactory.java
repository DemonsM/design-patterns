package creational.factory.test;

/**
 * @author MT
 * @date 2021/1/22 10:58
 */
public class MaskFactory {
    public Mask create(String type) {
        //使用简单工厂模式实现此处的逻辑
        switch (type) {
            case "Surgical":
                return new SurgicalMask();
            case "N95":
                return new N95Mask();
            default:
                throw new IllegalArgumentException("暂时没有这种口罩");
        }
    }
}
