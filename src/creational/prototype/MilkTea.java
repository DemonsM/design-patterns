package creational.prototype;

/**
 * @author MT
 * @date 2021/1/22 15:40
 */
public class MilkTea {
    public String type;
    public boolean ice;

    public MilkTea clone() {
        MilkTea milkTea = new MilkTea();
        milkTea.type = this.type;
        milkTea.ice = this.ice;
        return milkTea;
    }
}
