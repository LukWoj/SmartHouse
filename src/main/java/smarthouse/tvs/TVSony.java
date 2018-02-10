package smarthouse.tvs;

import driver.SonyDriver;
import smarthouse.Room;

public class TVSony implements TV {

    private SonyDriver driver;
    private Room room;

    public TVSony() {
        this.driver = new SonyDriver();
    }

    @Override
    public void turnOff() {
        driver.turnOff();
    }

    @Override
    public void turnOn() {
        driver.turnOnSony();
    }
}
