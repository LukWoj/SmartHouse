package smarthouse.tvs;

import driver.SamsungDriver;
import smarthouse.Room;


public class TVSamsung implements TV {

    private SamsungDriver driver;

    public TVSamsung() {
        this.driver = new SamsungDriver();
    }

    @Override
    public void turnOff() {
        driver.turnOff();
    }

    @Override
    public void turnOn() {
        driver.turnOnSamsung();
    }

}
