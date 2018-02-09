package smarthouse.tvs;

import driver.SonyDriver;
import smarthouse.Room;

public class TVSony implements TV {

    private SonyDriver driver;
    private Room room;

    public TVSony(Room room) {
        this.driver = new SonyDriver();
        this.room = room;
    }

    @Override
    public void turnOff() {
        driver.turnOff();
    }

    @Override
    public Room getRoom() {
        return room;
    }

    @Override
    public void turnOn() {
        driver.turnOnSony();
    }
}
