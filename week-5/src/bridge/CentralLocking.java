package bridge;

/**
 * Created by sush on 30/03/2016.
 */
public class CentralLocking implements Product {

    private final String productName;

    public CentralLocking(String productName){
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking System");
    }

}

