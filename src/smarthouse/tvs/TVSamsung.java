package smarthouse.tvs;

import driver.SamsungDriver;
import smarthouse.Room;


public class TVSamsung implements TV {

    private SamsungDriver driver;
    private Room room;

    public TVSamsung(Room room) {
        this.driver = new SamsungDriver();
        this.room=room;
    }

    @Override
    public void shutDown() {
        driver.turnOff();
    }

    @Override
    public Room getRoom() {
        return room;
    }
}
