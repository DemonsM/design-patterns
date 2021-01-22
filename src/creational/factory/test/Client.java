package creational.factory.test;

/**
 * @author MT
 * @date 2021/1/22 10:58
 */
public class Client {
    public static void test() {
        MaskFactory factory = new MaskFactory();
        // 输出：这是医用口罩
        System.out.println(factory.create("Surgical"));
        // 输出：这是 N95 口罩
        System.out.println(factory.create("N95"));
    }

    public static void main(String[] args) {
        test();
    }
}
