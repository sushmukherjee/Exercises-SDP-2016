package builder;

/**
 * Created by sush on 30/03/2016.
 */
public interface CarBuilder {

    void buildBodyStyle();

    void buildPower();

    void buildEngine();

    void buildBreaks();

    void buildSeats();

    void buildWindows();

    void buildFuelType();

    Car getCar();
}

