package bridge;

/**
 * Created by sush on 30/03/2016.
 */
public class GearLocking implements Product {

    private final String productName;

    public GearLocking(String productName){
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Gear Locking System");
    }
}
