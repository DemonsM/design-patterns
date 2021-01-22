package creational.prototype;

/**
 * @author MT
 * @date 2021/1/22 15:45
 */
public class Order {
    public static void main(String[] args) throws CloneNotSupportedException {
        MilkTea1 milkTeaOfJay = new MilkTea1();
        milkTeaOfJay.type = "原味";
        milkTeaOfJay.ice = false;
        System.out.println(milkTeaOfJay);

        MilkTea1 youMilkTea = milkTeaOfJay.clone();
        System.out.println(youMilkTea);
    }
}
